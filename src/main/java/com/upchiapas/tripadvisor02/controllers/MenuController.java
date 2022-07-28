package com.upchiapas.tripadvisor02.controllers;

import com.upchiapas.tripadvisor02.HelloApplication;
import com.upchiapas.tripadvisor02.models.Fumador;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class MenuController {

    @FXML
    private Label labelNombreDeUsuario;

    @FXML
    void btnRegistrarConsumoOnMouseClicked(MouseEvent event) {

        HelloApplication.setFXML("hello-view","Hello");
    }

    @FXML
    void btnEstadisticaOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("estadistica-view","Estadistica");
    }

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
                HelloApplication.setFXML("deseaSalir-view","DeseaSalir");
    }


    @FXML
    void btnNombrelolOnMouseClicked(MouseEvent event) {
        labelNombreDeUsuario.setText(Fumador.getPersona().getNombre());
    }
}

