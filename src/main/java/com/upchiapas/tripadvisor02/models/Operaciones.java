package com.upchiapas.tripadvisor02.models;

import java.util.ArrayList;

public class Operaciones {
    private static Persona objetoPersona;
    private static ArrayList<Consumo> arraylistConsumo;
    private static Fumador objetoFumador= new Fumador(objetoPersona, arraylistConsumo);

    private static void llenarInfo(){
        objetoFumador.asociarPersona();
        objetoFumador.asociarConsumo();
    }

    public static int calcularCigarrillosConsumidos(){
        llenarInfo();
        int cuantoHeFumado=0;
        for (int i=0; i<objetoFumador.getConsumo().size(); i++)
            cuantoHeFumado+=objetoFumador.getConsumo().get(i).getCigarrosCantidad();
        return cuantoHeFumado;
    }

    public static int calcularPromedio(){
        int totalCigarrillos= calcularCigarrillosConsumidos();
        return totalCigarrillos/objetoFumador.getConsumo().size();
    }

    public static String comoMeSientoAlFumar(){
        llenarInfo();
        int feliz=0, trizte=0;
        String mensaje;
        for (int i=0; i<objetoFumador.getConsumo().size(); i++){
            if (objetoFumador.getConsumo().get(i).getEstadoDeAnimo()=='F')
                feliz ++;
            else if (objetoFumador.getConsumo().get(i).getEstadoDeAnimo()=='T')
                trizte ++;
        }
        if (trizte>feliz)
            mensaje= "Usted se ha sentido triste "+objetoFumador.getConsumo().size()+" veces,  \ncuando fuma.\n" +
                    feliz+" Veces se ha sentido feliz y " + trizte+" veces se ha \n sentido trizte.";
        else mensaje= "Ultimamente usted ah estado feliz; de "+objetoFumador.getConsumo().size()+" Veces que \n ha fumado:\n" +
                    feliz+" Veces se ha sentido feliz y  " + trizte+" veces se ha \n sentido triste";
        return mensaje;
    }

    public static String meSientoAcompañado(){
        llenarInfo();
        int solo=0, acompañado=0;
        String mensaje;
        for (int i=0; i<objetoFumador.getConsumo().size(); i++){
            if (objetoFumador.getConsumo().get(i).compania=='s')
                acompañado++;
            else if (objetoFumador.getConsumo().get(i).compania=='n')
                solo ++;
        }
        if (solo>acompañado)
            mensaje="La mayoria de las veses que fuma usted se \nencuentra solo.";
        else mensaje="La mayoria de las veces que fuma usted se \nencuentra acompañado.";
        return mensaje;
    }

    public static String verHistorial(){
        String impresion = "";
        String mensaje="";
        String fecha="";
        String cantidad="";
        String comentrio="";
        llenarInfo();
        for (int i=0; i<objetoFumador.getConsumo().size(); i++){
            fecha=objetoFumador.getConsumo().get(i).fechaConsumo.toString()+" ";
            cantidad=Integer.toString(objetoFumador.getConsumo().get(i).getCigarrosCantidad())+" cigarrillos;";
            comentrio=objetoFumador.getConsumo().get(i).comentario;

            mensaje+= fecha+": "+cantidad+" "+comentrio+"\n";
        }
        return impresion=mensaje;
    }

}
