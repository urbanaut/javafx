package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        stage.setTitle("Hello JavaFX");
//        Integer width = Integer.parseInt(getParameters().getNamed().get("width"));
//        Integer height = Integer.parseInt(getParameters().getNamed().get("height"));
        Group group = new Group(new Button("Hello Label"));
        Scene scene = new Scene(group, 200 , 200);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}



