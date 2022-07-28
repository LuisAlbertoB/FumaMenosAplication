package com.upchiapas.tripadvisor02.controllers;

import com.upchiapas.tripadvisor02.HelloApplication;
import com.upchiapas.tripadvisor02.models.Consumo;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import java.time.LocalDate;
import java.util.ArrayList;

public class HelloController{


    private static ArrayList<Consumo> arrayListConsumo= new ArrayList<>();
    private static Consumo objetoConsumo;
    @FXML
    private RadioButton myButtonTriste;
    @FXML
    private RadioButton myButtonSi;
    @FXML
    private TextField mytfComentario;
    @FXML
    private DatePicker myDateFechaDeConsumo;
    @FXML
    private TextField txtfCantidadConsumidaCigarros;



    @FXML
    private char getEstadoDeAnimo() {
        char estadoDeAnimo = ' ';
        if (myButtonTriste.isSelected()) {
            estadoDeAnimo = 'T';
        } else {
            estadoDeAnimo = 'F';
        }
        return estadoDeAnimo;
    }

    private char getCompania() {
        char compania = ' ';
        if (myButtonSi.isSelected()) {
            compania = 's';
        } else {
            compania = 'n';
        }
        return compania;
    }

    @FXML
    void btnFormularioOnMouseClicked(MouseEvent event) {
        LocalDate fechaConsumo = LocalDate.of(myDateFechaDeConsumo.getValue().getYear(), myDateFechaDeConsumo.getValue().getMonth(), myDateFechaDeConsumo.getValue().getDayOfMonth());
        char estadoDeAnimo = getEstadoDeAnimo();
        char compania= getCompania();
        String comentario=mytfComentario.getText();


        int cigarrosCantidad = 0;
        boolean isError=true;
        try {
            cigarrosCantidad = Integer.parseInt(txtfCantidadConsumidaCigarros.getText());
            if (cigarrosCantidad>=1)
            isError = false;

        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Puede que haya dejado un dato vacio o ingresado un dato de forma incorrecta, ¡porfavor verifique que todo este correcto!");
            alert.showAndWait();
        }
        if (!isError) {
            objetoConsumo = new Consumo(estadoDeAnimo, cigarrosCantidad, compania, comentario, fechaConsumo);
            arrayListConsumo.add(objetoConsumo);
            HelloApplication.setFXML("menu-view", "Menu");
        }else{
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText("Puede que haya dejado un dato vacio o ingresado un dato de forma incorrecta, ¡porfavor verifique que todo este correcto!");
        alert.showAndWait();
        }
    }
    @FXML
    void initialize(){
        myDateFechaDeConsumo.setValue(LocalDate.now());
    }

    public static ArrayList<Consumo> getArrayListConsumo() {
        return arrayListConsumo;
    }
}
