package com.upchiapas.tripadvisor02.controllers;

import com.upchiapas.tripadvisor02.HelloApplication;
import com.upchiapas.tripadvisor02.models.Persona;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.time.LocalDate;
import java.util.Objects;
import java.util.ResourceBundle;

public class EntradaController implements Initializable {

    private static Persona objetoPersona;
    @FXML
    private DatePicker mydatenacimiento;
    @FXML
    private TextField mytxtCantidadCigarros;
    @FXML
    private TextField mytxtMesesDeFumador;
    @FXML
    private TextField mytxtname;
    @FXML
    private RadioButton radioMasculino;
    @FXML
    private ChoiceBox<String> myNacionalidad;

    private String[] nacionalidad = {"Mexicana","Española","EstadoUnidense","Venezolana","Francesa","Colombiana"};
    public void initialize(URL arg0, ResourceBundle arg1){
        myNacionalidad.getItems().addAll(nacionalidad);
        mydatenacimiento.setValue(LocalDate.now());
    }

    @FXML
    void btnAtrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("inicio-view","Inicio");
    }

    private char getSexo() {
        char sexo= ' ';
        if(radioMasculino.isSelected()){
            sexo = 'M';
        }
        else {
            sexo = 'F';
        }
        return sexo;
    }


    @FXML
    void btnSiguienteOnMouseClicked(MouseEvent event) {
        String nombre = mytxtname.getText();
        String nacionalidad = (String) (myNacionalidad.getValue());
        char sexo= getSexo();
        LocalDate fechaNacimiento = LocalDate.of(mydatenacimiento.getValue().getYear(), mydatenacimiento.getValue().getMonth(), mydatenacimiento.getValue().getDayOfMonth());
        int mesesFumador=0;
        int cigarrillosDiarios=0;
        boolean isError;
        try{
            mesesFumador= Integer.parseInt(mytxtMesesDeFumador.getText());
            cigarrillosDiarios= Integer.parseInt(mytxtCantidadCigarros.getText());
            isError = false;
            if (!Objects.equals(nombre, "")&&(mesesFumador>0&&cigarrillosDiarios>0)) {
                objetoPersona = new Persona(nombre, fechaNacimiento, sexo, nacionalidad, mesesFumador, cigarrillosDiarios);

                HelloApplication.setFXML("menu-view", "Menu");
            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("No ha llenado el dato de nombre completo, ¡porfavor ingrese su nombre de manera correcta!");
                alert.showAndWait();
            }
        }catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Puede que haya dejado un dato vacio o ingresado un dato de forma incorrecta, ¡porfavor verifique que todo este correcto!");
            alert.showAndWait();
        }
    }

    public static Persona getObjetoPersona() {
        return objetoPersona;
    }
}
