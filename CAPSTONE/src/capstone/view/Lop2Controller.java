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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author iamjoross
 */
public class Lop2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    String string="";
    @FXML private TextField txt;
    @FXML private Button a,b;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println("lop2 init()");
    }    
    @FXML
    public void handle(ActionEvent evt){
        if(evt.getSource().equals(a)){
            string += "a";
            txt.setText(string);
        }
    }
    
    public TextField getTxt(){
        return txt;
    }
    
}
