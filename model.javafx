package com.mycompany.javafxasssignment;

import java.util.List;


public class ShoppingListController {
    private ShoppingListModel model;

    public ShoppingListController(ShoppingListModel model) {
        this.model = model;
    }

    public void addItem(String item) {
        model.addItem(item);
    }

    public void removeItem(String item) {
        try {
            model.removeItem(item);
        } catch (IllegalArgumentException e) {
            
            System.err.println(" " + e.getMessage());
            
        }
    }

    public List<String> getShoppingList() {
        return model.getShoppingList();
    }
}
