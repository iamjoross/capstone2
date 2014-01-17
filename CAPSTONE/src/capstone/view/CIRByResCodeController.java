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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author JARVIS
 */
public class CIRByResCodeController implements Initializable, ControlledScreen {

    

    @FXML private VBox statusContainer;
    @FXML TextField resCodeTxt;
    
    
    ScreenController myController;
    private TranslateTransition showStatus;
    private TranslateTransition hideStatus;
    boolean showsStatus = false;

    @FXML private KeyboardController keyboardController;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        
        System.out.println("rescode init()");
        System.out.println(keyboardController+"");
        resCodeTxt.textProperty().bind(keyboardController.getTextField().textProperty());
        
        //<editor-fold defaultstate="collapsed" desc="comment">
        showStatus = new TranslateTransition(Duration.millis(250), statusContainer);
        showStatus.setByY(-300.0);
        showStatus.setOnFinished((ActionEvent event) -> {
            showsStatus = true;
        });
        hideStatus = new TranslateTransition(Duration.millis(250), statusContainer);
        hideStatus.setByY(300.0);
        hideStatus.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showsStatus = false;
            }
        });
//</editor-fold>
    }

    @Override
    public void setScreenParent(ScreenController screenParent) {
        myController = screenParent;
    }

    @FXML
    private void goBack(ActionEvent event) {
        myController.setScreen(Main.screen5ID);
    }

    @FXML
    private void goToByQR(ActionEvent event) {
       // myController.setScreen(Main.screen9ID);
        
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
    
    @FXML
    public void toggleStatusMouse(MouseEvent event) {
        if (showsStatus) {
            showStatus.stop();
            hideStatus.play();
        } else {
            hideStatus.stop();
            showStatus.play();
        }
    }

}
