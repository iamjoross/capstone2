/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstone.view;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author JoseRoss
 */
public class VirtualKeyboardDisplay extends Application {

    public String resource = "view/Keyboard_1.fxml";
    
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource(resource));
            Parent loadScreen = (Parent) myLoader.load();
            
            Scene scene = new Scene(loadScreen);
        
            
            stage.setScene(scene);
            stage.setResizable(false);
                    stage.show();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
            
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
