package com.algo.threads;

public class Printer {

    public static void main(String[] args) {
        PrinterQueue printerQueue = new PrinterQueue();
        Thread thread[] = new Thread[5];
        for (int i = 0; i < 5; i++) {
            thread[i] = new Thread(new PrintingJob(printerQueue), "Thread " + i);
        }
        for (int i = 0; i < 5; i++) {
            thread[i].start();
        }

    }

}
