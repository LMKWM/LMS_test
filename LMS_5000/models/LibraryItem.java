// File: models/LibraryItem.java
package models;

public abstract class LibraryItem {
    protected String id;
    protected String title;

    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public abstract String getDetails();
    public abstract boolean isAvailable();

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title;
    }
}
