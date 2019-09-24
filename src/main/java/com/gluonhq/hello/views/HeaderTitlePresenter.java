package com.gluonhq.hello.views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.gluonhq.charm.glisten.afterburner.GluonPresenter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import com.gluonhq.hello.HelloGluon;

/**
 * FXML Controller class
 *
 * @author Susan
 */
public class HeaderTitlePresenter extends GluonPresenter<HelloGluon> implements Initializable {
    public final static String  LOGOIMAGE = "VEESIM Logo Final - No tagline.png";
    @FXML private AnchorPane ht;
    @FXML private ImageView Logo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Logo.setImage(new Image(LOGOIMAGE));
    }    
}
