package com.company.model;

public class Habitacion {
        //campos

    public int camasIndividuales;
    public  int camasDobles;
    public boolean vistas;
    public boolean bañoPrivado;
    public boolean bañoPublico;
    public boolean aparcamiento;
    public boolean wifi;

    //metodos
        public void asignarNumerodeCamasIndividuales( int numeroCamas){
            camasIndividuales = numeroCamas;
        }
         public void asignarNumerodeCamasDobles( int numeroCamas){
            camasDobles = numeroCamas;
         }

    }