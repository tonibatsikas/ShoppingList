package com.example.shoppinglist;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingListAppTest {

    private ShoppingListApp shoppingListApp;

    @BeforeEach
    public void setUp() {
        shoppingListApp = new ShoppingListApp();
    }

    @org.testng.annotations.Test
    public void testAddItem() {
        shoppingListApp.addItem("Item 1");
        shoppingListApp.addItem("Item 2");
        // Fügen Sie hier Assertions hinzu, um zu überprüfen, ob die Elemente korrekt hinzugefügt wurden
    }

    @Test
    public void testRemoveItem() {
        // Fügen Sie hier Tests hinzu, um das Entfernen von Elementen zu überprüfen
    }

    @Test
    public void testResetList() {
        // Fügen Sie hier Tests hinzu, um das Zurücksetzen der Liste zu überprüfen
    }
}