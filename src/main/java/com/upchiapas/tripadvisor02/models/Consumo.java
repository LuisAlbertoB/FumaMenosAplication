package com.upchiapas.tripadvisor02.models;

import java.time.LocalDate;

public class Consumo {
    private char estadoDeAnimo;
    private int cigarrosCantidad;
    public char compania;
    public String comentario;
    public LocalDate fechaConsumo;

    public Consumo(char estadoDeAnimo, int cigarrosCantidad, char compania,
                   String comentario, LocalDate fechaConsumo) {
        this.estadoDeAnimo = estadoDeAnimo;
        this.cigarrosCantidad= cigarrosCantidad;
        this.compania = compania;
        this.comentario = comentario;
        this.fechaConsumo=fechaConsumo;
    }

    public char getEstadoDeAnimo() {
        return estadoDeAnimo;
    }

    public void setEstadoDeAnimo(char estadoDeAnimo) {
        this.estadoDeAnimo = estadoDeAnimo;
    }

    public int getCigarrosCantidad() {
        return cigarrosCantidad;
    }

    public void setCigarrosCantidad(int cigarrosCantidad) {
        this.cigarrosCantidad = cigarrosCantidad;
    }

    public char getCompania() {
        return compania;
    }

    public void setCompania(char compania) {
        this.compania = compania;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFechaConsumo() {
        return fechaConsumo;
    }

    public void setFechaConsumo(LocalDate fechaConsumo) {
        this.fechaConsumo = fechaConsumo;
    }
}
