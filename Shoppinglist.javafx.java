package com.example.shoppinglist;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingListApp extends Application {
    private GridPane gridPane;
    private TextField itemInput;
    private List<ShoppingItem> itemList;

    @Override
    public void start(Stage primaryStage) {
        gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(5);
        gridPane.setPadding(new Insets(10));

        itemInput = new TextField();
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addItem());

        Button resetButton = new Button("Reset");
        resetButton.setOnAction(e -> resetList());

        gridPane.add(itemInput, 0, 0);
        gridPane.add(addButton, 1, 0);
        gridPane.add(resetButton, 0, 1);

        itemList = new ArrayList<>();

        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Shoppinglist");
        primaryStage.show();
    }

    private void addItem() {
        String newItem = itemInput.getText().trim();
        if (!newItem.isEmpty()) {
            ShoppingItem shoppingItem = new ShoppingItem(newItem);
            itemList.add(shoppingItem);
            updateListView();
            itemInput.clear();
        }
    }

    private void updateListView() {
        gridPane.getChildren().clear();
        gridPane.add(itemInput, 0, 0);
        int row = 1;
        for (ShoppingItem item : itemList) {
            gridPane.addRow(row++, item.getLabel(), item.getRemoveButton());
        }
        gridPane.add(new Button("Reset"), 0, row);
    }

    private void resetList() {
        itemList.clear();
        updateListView();
    }

    public static void main(String[] args) {
        launch(args);
    }

    static class ShoppingItem implements Comparable<ShoppingItem> {
        private String name;

        public ShoppingItem (String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public TextField getLabel() {
            return new TextField(name);
        }

        public Button getRemoveButton() {
            Button removeButton = new Button("Delete");
            removeButton.setOnAction(e -> removeItem(this));
            return removeButton;
        }
        @Override
        public int compareTo(ShoppingItem otherItem) {
            return this.name.compareTo(otherItem.getName());
        }
    }

    private static void removeItem(ShoppingItem itemToRemove) {
        System.out.println("Delete button clicked for: " + itemToRemove.getName());
    }
}