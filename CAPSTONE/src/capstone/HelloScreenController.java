/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capstone;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author JARVIS
 */
public class HelloScreenController implements Initializable , ControlledScreen {

    ScreensController myController;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @FXML
    private void goBack(ActionEvent event){
       myController.setScreen(ScreensFramework.screen1ID);
    }
    
    
}
