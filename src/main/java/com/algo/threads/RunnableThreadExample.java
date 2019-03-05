package com.algo.threads;

public class RunnableThreadExample implements Runnable {

    public int count = 0;

    @Override
    public void run() {
        System.out.println("Runnable thread staring:");
        try {
            while (count < 5) {
                System.out.println("Waiting: "+ count);
                Thread.sleep(500);
                count++;
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interupted");
        }
        System.out.println("Thread terminating");
    }

    public static void main(String[] args) {

        RunnableThreadExample runnableInstance = new RunnableThreadExample();
        Thread thread = new Thread(runnableInstance);
        thread.start();

        while (runnableInstance.count != 5) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
