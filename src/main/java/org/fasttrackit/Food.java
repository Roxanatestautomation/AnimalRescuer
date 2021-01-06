package org.fasttrackit;

import java.time.LocalDateTime;

public class Food {
    String name;
    double price;
    double quantity;
    boolean inStock;
    LocalDateTime expiryDate;

    public Food(String name) {
        this.name = name;
    }
}
