package com.company;

import com.company.manager.ManagerClientes;
import com.company.manager.ManagerHabitacion;
import com.company.manager.ManagerReserva;
import com.company.view.PantallaMenuPrincipal;

public class Main {

    public static void main(String[] args) {

        ManagerClientes.crearCliente("a", "a");

//        ManagerHabitacion.crearHabitacion("");
//        ManagerHabitacion.crearHabitacion("");
//        ManagerHabitacion.crearHabitacion("");
        PantallaMenuPrincipal pantallaMenuPrincipal = new PantallaMenuPrincipal();
        pantallaMenuPrincipal.iniciar();

    }
}