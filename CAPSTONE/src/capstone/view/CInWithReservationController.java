/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package capstone.view;

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
public class CInWithReservationController implements Initializable, ControlledScreen {

   ScreenController myController;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setScreenParent(ScreenController screenParent){
        myController = screenParent;
    }   
    @FXML
    private void goBack(ActionEvent event) {
        myController.setScreen(Main.screen3ID);
    }
    @FXML
    private void goToByQR(ActionEvent event) {
        myController.setScreen(Main.screen6ID);
    }
    @FXML
    private void goToByResCode(ActionEvent event) {
        myController.setScreen(Main.screen7ID);
    }
    
}