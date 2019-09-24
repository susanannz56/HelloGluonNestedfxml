/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gluonhq.hello;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import com.gluonhq.hello.views.HeaderTitlePresenter;

/**
 *
 * @author Susan
 */
public class HeaderTitle extends AnchorPane {
    private final HeaderTitlePresenter controller;
    
    public HeaderTitlePresenter getController() { return controller; }
    public HeaderTitle() {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloGluon.class.getResource("views/headertitle.fxml"));
        fxmlLoader.setRoot(this);
        try {
            Node view = (Node)fxmlLoader.load();
        } catch (IOException e) {
                System.err.println(e.getMessage()); 
                System.err.println("Caused by . . ." + e.toString()); 
       }
        controller = fxmlLoader.getController();
    }     
    
}
