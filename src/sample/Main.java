package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Board.fxml"));
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setTitle("8 Ball Pool");
        primaryStage.setScene(new Scene(root, 783,535));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}