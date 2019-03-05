package com.algo.ood;

public abstract class Entry {

    protected Directory parent;
    protected long created;
    protected long lastUpdated;
    protected long lastAccessed;
    protected String name;

    public Entry(String n, Directory p) {
        parent = p;
        name = n;
        created = System.currentTimeMillis();
        lastUpdated = System.currentTimeMillis();
        lastAccessed = System.currentTimeMillis();

    }

    public boolean delete() {
        if (parent == null) {
            return false;
        }
        return parent.deleteEntry(this);

    }

    public abstract int size();

    public String getFullPath() {
        if (parent == null) {
            return name;
        } else {
            return parent.getFullPath() + "/" + name;
        }
    }

    public long getCreationTime() {
        return created;
    }

    public long getLastUpdateTime() {
        return lastUpdated;
    }

    public long getLastAccessedTime() {
        return lastAccessed;
    }
    
    public void changeName(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
}
