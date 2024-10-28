// File: models/Magazine.java
package models;

import java.time.LocalDate;

public class Magazine extends LibraryItem {
    private LocalDate issueDate;

    public Magazine(String id, String title, LocalDate issueDate) {
        super(id, title);
        this.issueDate = issueDate;
    }

    @Override
    public String getDetails() {
        return "Magazine - " + super.toString() + ", Issue Date: " + issueDate;
    }

    @Override
    public boolean isAvailable() {
        return true; // Magazines are always available in this example
    }
}
