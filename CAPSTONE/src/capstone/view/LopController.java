/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package capstone.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author iamjoross
 */
public class LopController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML TextField txt;
    @FXML private Lop2Controller lop2Controller;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        txt.textProperty().bind(lop2Controller.getTxt().textProperty());
      
    }    
    
    
    
}
