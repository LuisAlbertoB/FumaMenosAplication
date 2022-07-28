package com.upchiapas.tripadvisor02.models;

import java.time.LocalDate;

public class Persona {

    private static String nombre;
    private LocalDate fechaDeNacimiento;
    private char sexo;
    private String nacionalidad;
    private int tiempoFumador;
    private int cigarrillosDiarios;

    public Persona(String nombre,
                   LocalDate fechaDeNacimiento,
                   char sexo,
                   String nacionalidad,
                   int tiempoFumador,
                   int cigarrillosDiarios) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.tiempoFumador = tiempoFumador;
        this.cigarrillosDiarios = cigarrillosDiarios;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getTiempoFumador() {
        return tiempoFumador;
    }

    public void setTiempoFumador(byte tiempoFumador) {
        this.tiempoFumador = tiempoFumador;
    }

    public int getCigarrillosDiarios() {
        return cigarrillosDiarios;
    }

    public void setCigarrillosDiarios(byte cigarrillosDiarios) {
        this.cigarrillosDiarios = cigarrillosDiarios;
    }
}
