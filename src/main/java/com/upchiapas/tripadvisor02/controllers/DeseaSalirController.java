package com.upchiapas.tripadvisor02.controllers;

import com.upchiapas.tripadvisor02.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;


public class DeseaSalirController {

    @FXML
    void btnSalirNoOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("menu-view", "Menu");
    }

    @FXML
    void btnSalirSiOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }
}

