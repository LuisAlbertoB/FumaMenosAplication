package com.upchiapas.tripadvisor02.models;

import com.upchiapas.tripadvisor02.controllers.EntradaController;
import com.upchiapas.tripadvisor02.controllers.HelloController;

import java.util.ArrayList;

public class Fumador {
    private static Persona persona;
    private ArrayList<Consumo> consumo;

    public Fumador(Persona persona, ArrayList<Consumo> consumo) {
        this.persona = persona;
        this.consumo = consumo;
    }

    public void asociarPersona(){
        persona=EntradaController.getObjetoPersona();
    }

    public void asociarConsumo(){
         consumo= HelloController.getArrayListConsumo();
    }

    public static Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public ArrayList<Consumo> getConsumo() {
        return consumo;
    }

    public void setConsumo(ArrayList<Consumo> consumo) {
        this.consumo = consumo;
    }
}
