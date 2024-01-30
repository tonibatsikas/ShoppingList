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
            // Hier wird die Exception abgefangen und behandelt
            System.err.println("Error " + e.getMessage());
            // Du kannst hier weitere Behandlungen hinzufügen, z.B. eine Benachrichtigung an den Benutzer
        }
    }

    public List<String> getShoppingList() {
        return model.getShoppingList();
    }
}