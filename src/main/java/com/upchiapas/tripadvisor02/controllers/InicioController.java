package com.upchiapas.tripadvisor02.controllers;

import com.upchiapas.tripadvisor02.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

    public class InicioController {

        @FXML
        void btnComenzarOnMouseClicked(MouseEvent event) {
            HelloApplication.setFXML("entrada-view","Entrada");
        }

        @FXML
        void btnSalirFumaOnMouseClicked(MouseEvent event) {
            System.exit(1);
        }
       }


