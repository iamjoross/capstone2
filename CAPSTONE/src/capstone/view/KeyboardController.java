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
 * @author JoseRoss
 */
public class KeyboardController implements Initializable, ControlledScreen {

    
    

    @FXML private Button q, w, one, two;
    @FXML private TextField inputTxt;
    
    String inputString="";
    ScreenController myController;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("KeyBoardController init()");
    }

    @Override
    public void setScreenParent(ScreenController screenParent) {
        myController = screenParent;
    }
    
    public Button getQ(){
        return q;
    }
    public Button getW(){
        return w;
    }
    public void setTextField(String value){
        inputTxt.setText(value);
    }
    public TextField getTextField(){
        return inputTxt;
    }

    @FXML
    public void handlePressedKey(ActionEvent event) {
        if (event.getSource().equals(q)) {
            inputString+="q";
            setTextField(inputString);
            
        } else {
            System.out.println("dili ko q");
        }
    }

}
