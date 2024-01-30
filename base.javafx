package com.mycompany.javafxasssignment;

import java.util.List;
import java.util.ArrayList;

public abstract class ShoppingListBase {
    protected String name;
    protected List<String> items;

    public ShoppingListBase(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public abstract void addItem(String item);
    public abstract void removeItem(String item);

    public void printDetails() {
        System.out.println("name from artikle: " + name);
        for (String item : items) {
            System.out.println("- " + item);
        }
    }

}
