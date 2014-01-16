/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstone.controller;

/**
 * Copyright (c) 2008, 2012 Oracle and/or its affiliates. All rights reserved.
 * Use is subject to license terms.
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.control.PaginationBuilder;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

/**
 * A sample that demonstrates pagination
 *
 * @see javafx.scene.control.Pagination
 * @resource animal1.jpg
 * @resource animal2.jpg
 * @resource animal3.jpg
 * @resource animal4.jpg
 * @resource animal5.jpg
 * @resource animal6.jpg
 * @resource animal7.jpg
 * @resource animal8.jpg
 */
public class PaginationSample extends Application {

    private Pagination pagination;
    private final Image[] images = new Image[4];

    private void init(Stage primaryStage) {
        
        Group root = new Group();
        primaryStage.setScene(new Scene(root));
        VBox outerBox = new VBox();
        outerBox.setAlignment(Pos.CENTER);
        
        //Images for our pages
        for (int i = 0; i < 4; i++) {
            images[i] = new Image(PaginationSample.class.getResource("a" + (i + 1) + ".jpg").toExternalForm(), false);
        }

        pagination = PaginationBuilder.create().pageCount(4).pageFactory(new Callback<Integer, Node>() {
            @Override
            public Node call(Integer pageIndex) {
                return createAnimalPage(pageIndex);
            }
        }).build();

        pagination.getStyleClass().add(Pagination.STYLE_CLASS_BULLET);

        outerBox.getChildren().addAll(pagination);
        root.getChildren().add(outerBox);
    }

    //Creates the page content
    private VBox createAnimalPage(int pageIndex) {
        VBox box = new VBox();
        ImageView iv = new ImageView(images[pageIndex]);
        box.setAlignment(Pos.CENTER);
        Label desc = new Label("PAGE " + (pageIndex + 1));
        box.getChildren().addAll(iv, desc);
        return box;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        init(primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
