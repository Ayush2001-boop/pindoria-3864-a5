package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Ayush Pindoria
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InventoryTracker extends Application
{

    private static Stage mainWindow;

    public static Stage getMainWindow()
    {
        return mainWindow;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException
    {
        mainWindow = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("InventoryGUI.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setTitle("Inventory App");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
