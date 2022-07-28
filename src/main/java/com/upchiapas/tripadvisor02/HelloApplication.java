/* package com.upchiapas.tripadvisor02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public static  void  setFXML(String nameView,String title){
        scene.setRoot(loadFXML(nameView));
        stage.sizeToScene();
        stage.centerOnScreen();
        stage.setResizable(false);
    }

    public static void main(String[] args) {
        launch();
    }
}*/
package com.upchiapas.tripadvisor02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage=stage;
        scene = new Scene(loadFXML("inicio-view"));
        stage.setTitle(" Fuma - God");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }
    public static Parent loadFXML(String nameView){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(nameView+ ".fxml"));
        try {
            return fxmlLoader.load();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static  void  setFXML(String nameView,String title){
        scene.setRoot(loadFXML(nameView));
        stage.sizeToScene();
        stage.centerOnScreen();
        stage.setResizable(false);
    }

    public static void main(String[] args) {
        launch();
    }
}