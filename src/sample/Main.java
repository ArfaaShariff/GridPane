package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {
    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        window.setTitle("Grid Pane");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label nameLabel= new Label("Username:");
        GridPane.setConstraints(nameLabel, 0, 0);

       // TextField nameInput= new TextField();
        //GridPane.setConstraints(nameInput, 1, 0);

        TextField nameInput= new TextField();
        nameInput.setPromptText("Enter your name");
        GridPane.setConstraints(nameInput, 1, 0);

        Label passLabel= new Label("Password");
        GridPane.setConstraints(passLabel, 0, 1);

        TextField passInput= new TextField();
        passInput.setPromptText("Password");
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton= new Button("Login");
        GridPane.setConstraints(loginButton,1,2);

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);

        Scene scene = new Scene(grid,300,200);
        window.setScene(scene);




        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
