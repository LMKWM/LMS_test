// File: services/Library.java
package services;

import models.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> libraryItems = new ArrayList<>();

    public void addItem(LibraryItem item) {
        libraryItems.add(item);
        System.out.println("Item added to library.");
    }

    public void removeItem(String id) {
        libraryItems.removeIf(item -> item.toString().contains("ID: " + id));
        System.out.println("Item removed from library.");
    }

    public LibraryItem findItemByTitle(String title) {
        return libraryItems.stream()
                .filter(item -> item.toString().contains("Title: " + title))
                .findFirst()
                .orElse(null);
    }

    public void listItems() {
        libraryItems.forEach(item -> System.out.println(item.getDetails()));
    }
}
