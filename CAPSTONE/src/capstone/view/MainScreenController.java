package capstone.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.FadeTransitionBuilder;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author JARVIS
 */
public class MainScreenController implements Initializable, ControlledScreen {

    private FadeTransition fadeTransition;
    public ScreenController myController;

    @FXML
    private Label label;
    @FXML
    private AnchorPane ac;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fade();
        play();
        
    }

    public void fade() {
        fadeTransition = FadeTransitionBuilder.create()
                .duration(Duration.seconds(4))
                .node(label)
                .fromValue(1)
                .toValue(0.2)
                .cycleCount(Timeline.INDEFINITE)
                .autoReverse(true)
                .build();
    }

    public void play() {
        fadeTransition.play();
    }

    public void stop() {
        fadeTransition.stop();
    }

    

    @Override
    public void setScreenParent(ScreenController screenPage) {
        myController = screenPage;
    }

    @FXML
    private void goToCheckIn(MouseEvent event) {
        myController.setScreen(Main.screen2ID);
    }

}
