/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstone.view;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.SyndFeedInput;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import com.sun.syndication.io.XmlReader;
import java.io.IOException;
import java.util.Iterator;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author JARVIS
 */
public class MainMenuController implements Initializable, ControlledScreen {

    /**
     * Initializes the controller class.
     */
    public ScreenController myController;
    public URL url;
    public XmlReader reader=null;

    @FXML
    private  Label title;
    @FXML
    private  Label content;
    @FXML
    private Button button;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        transformButton();
        try {
            // TODO
            url = new URL("http://news.yahoo.com/rss/");
            reader =  new XmlReader(url);
            SyndFeed feed = new SyndFeedInput().build(reader);

            for (Iterator i = feed.getEntries().iterator(); i.hasNext();) {
                SyndEntry entry = (SyndEntry) i.next();
                title.setText(""+entry.getTitle());
                content.setText(entry.getDescription().getValue());
            }

        } catch (Exception ex) {
            Logger.getLogger(MainMenuController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(MainMenuController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    @Override
    public void setScreenParent(ScreenController screenPage) {
        myController = screenPage;
    }
    public void transformButton(){
        
        Reflection reflection = new Reflection();
        reflection.setFraction(0.6);
        reflection.setTopOffset(1.0);
        reflection.setTopOpacity(0.18);
        
        Bloom bloom = new Bloom();
        bloom.setThreshold(0.6);
        
        DropShadow effect = new DropShadow();
        effect.setColor(Color.rgb(51, 255, 231));
        effect.setBlurType(BlurType.THREE_PASS_BOX);
        effect.setSpread(0.6);
        effect.setRadius(9.0);
        
        button.setEffect(reflection);
        button.setEffect(bloom);
        button.setEffect(effect);
    }

    @FXML
    private void goToCheckIn(ActionEvent event) {
        myController.setScreen(Main.screen3ID);
    }

    @FXML
    private void goToCheckOut(ActionEvent event) {
        myController.setScreen(Main.screen4ID);
    }
    @FXML
    private void goToUnderCons(ActionEvent event) {
        myController.setScreen(Main.screen8ID);
    }

}
