/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capstone.view;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

    public static String screen1ID = "main";
    public static String screen1File = "view/MainScreen.fxml";
    public static String screen2ID = "mainMenu";
    public static String screen2File = "view/MainDashboard.fxml";
    public static String screen3ID = "checkIn";
    public static String screen3File = "view/CheckInScreen.fxml";
    public static String screen4ID = "checkOut";
    public static String screen4File = "view/CheckOut.fxml";
    public static String screen5ID = "withRes";
    public static String screen5File = "view/CInWithReservation.fxml";
    public static String screen6ID = "byQR";
    public static String screen6File = "view/CIRByQR.fxml";
    public static String screen7ID = "byResCode";
    public static String screen7File = "view/CIRByResCode.fxml";
    public static String screen8ID = "undeCons";
    public static String screen8File = "view/underConstruction.fxml";
    public static String screen9ID = "keyboard";
    public static String screen9File = "view/p.fxml";
    public static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println(com.sun.javafx.runtime.VersionInfo.getRuntimeVersion());
        primaryStage = stage;
        setPrimaryStage(stage);
        ScreenController mainContainer = new ScreenController();
        mainContainer.loadScreen(Main.screen1ID, Main.screen1File);
        mainContainer.loadScreen(Main.screen2ID, Main.screen2File);
        mainContainer.loadScreen(Main.screen3ID, Main.screen3File);
        mainContainer.loadScreen(Main.screen4ID, Main.screen4File);
        mainContainer.loadScreen(Main.screen5ID, Main.screen5File);
        mainContainer.loadScreen(Main.screen6ID, Main.screen6File);
        mainContainer.loadScreen(Main.screen7ID, Main.screen7File);
        mainContainer.loadScreen(Main.screen8ID, Main.screen8File);
        mainContainer.setScreen(Main.screen1ID);

        Scene scene = new Scene(mainContainer);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.F) {
                    primaryStage.setFullScreen(true);
                }
            }
        });

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    public static void setPrimaryStage(Stage stage) {

        Main.primaryStage = stage;
    }

    public static Stage getStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);

    }
}
