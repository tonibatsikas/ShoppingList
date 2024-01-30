package com.mycompany.javafxasssignment;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShoppingListApp extends Application {

    private ShoppingListController controller = new ShoppingListController(new ShoppingListModel());
    private VBox itemListContainer;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ShoppingList");

        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);

        TextField itemTextField = new TextField();
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> {
            String item = itemTextField.getText().trim(); // Trim leading and trailing whitespaces
            if (!item.isEmpty()) {
                controller.addItem(item);
                updateItemList();
                itemTextField.clear(); // Clear the text field after adding the item
            }
        });

        itemListContainer = new VBox();
        itemListContainer.setSpacing(5);

        root.getChildren().addAll(itemTextField, addButton, itemListContainer);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Initialisierung der Anzeige der Einkaufsliste
        updateItemList();
    }

    private void updateItemList() {
        itemListContainer.getChildren().clear();
        for (String item : controller.getShoppingList()) {
            Label itemLabel = new Label(item);
            Button removeButton = new Button("Remove");
            removeButton.setOnAction(e -> {
                controller.removeItem(item);
                updateItemList(); // Update the list after removing an item
            });
            itemListContainer.getChildren().add(new HBox(itemLabel, removeButton));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}