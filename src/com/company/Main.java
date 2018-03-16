package com.company;

import com.company.model.Habitacion;

public class Main {

    public static void main(String[] args) {
        Habitacion habitacionIndividual = new Habitacion();

        Habitacion habitacionDoble = new Habitacion();

        Habitacion habitacionExecutive = new Habitacion();

        Habitacion suite = new Habitacion();

        //HABITACION-INDIVIDUAL//
        Habitacion blue = new Habitacion();
        blue.camasIndividuales = 1;
        blue.vistas=true;
        blue.bañoPublico=true;

        Habitacion redLava = new Habitacion();
        redLava.camasIndividuales = 2;
        redLava.vistas=true;
        redLava.bañoPrivado=true;
        redLava.wifi=true;
    }
}
