package com.upchiapas.tripadvisor02.controllers;

import com.upchiapas.tripadvisor02.HelloApplication;
import com.upchiapas.tripadvisor02.models.Operaciones;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class EstadisticaController {


    @FXML
    private Label myLabelTxt;

    @FXML
    protected void btnCuantoHeFumadoOnMouseClicked(MouseEvent event) {
        myLabelTxt.setText("Usted ah fumado un total de: "+Integer.toString(Operaciones.calcularCigarrillosConsumidos())+"\ncigarrillos desde que ocupa la aplicacion.\n\n"
        +"Usted suele consumir: "+ Integer.toString(Operaciones.calcularPromedio())+"\ncigarrillos en promedio cada vez que fuma.");
    }

    @FXML
    void btnComoMeSientoAlFumarOnMouseClicked(MouseEvent event) {
        myLabelTxt.setText(Operaciones.comoMeSientoAlFumar() + "\n\n" + Operaciones.meSientoAcompañado());
    }

    @FXML
    void btnVerHistorialDeConsumoOnMouseClicked(MouseEvent event) {
        myLabelTxt.setText(Operaciones.verHistorial());
    }

    @FXML
    void btnRegresarOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("menu-view", "Menu");
    }
}
