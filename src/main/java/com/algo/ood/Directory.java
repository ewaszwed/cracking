package com.algo.ood;

import java.util.ArrayList;

public class Directory extends Entry {

    protected ArrayList<Entry> contents;

    public Directory(String s, Directory p) {
        super(s, p);
        contents = new ArrayList<>();
    }

    @Override
    public int size() {
        int size = 0;
        for (Entry e : contents) {
            size += e.size();
        }
        return size;
    }

    public int getNumberOfFiles() {

        int count = 0;
        for (Entry e : contents) {
            if (e instanceof Directory) {
                count++;
                Directory d = (Directory) e;
                count += getNumberOfFiles();
            } else if (e instanceof File) {
                count++;
            }
        }
        return count;

    }

    public boolean deleteEntry(Entry entry) {
        return contents.remove(entry);

    }

    public void addEntry(Entry entry) {
        contents.add(entry);
    }

    protected ArrayList<Entry> getContents() {
        return contents;
    }

}
