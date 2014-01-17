/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstone.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author JARVIS
 */
public class CIRByResCode_2aController implements Initializable, ControlledScreen {

    ScreenController myController;
    private TranslateTransition showStatus;
    private TranslateTransition hideStatus;
    boolean showsStatus = false;

    @FXML
    private KeyboardController keyboardController;
    @FXML private AnchorPane paneOnImage;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

      
    }

    
    

    @FXML
    public void onHover(MouseEvent evt){
        paneOnImage.setVisible(true);
    }
    @FXML
    public void onOut(MouseEvent evt){
        paneOnImage.setVisible(false);
    }
    
    @Override
    public void setScreenParent(ScreenController screenParent) {
        myController = screenParent;
    }

    @FXML
    public void toggleStatus(ActionEvent event) {
        if (showsStatus) {
            showStatus.stop();
            hideStatus.play();
        } else {
            hideStatus.stop();
            showStatus.play();
        }
    }

}
