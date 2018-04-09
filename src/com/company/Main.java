package com.company;

import com.company.manager.ManagerClientes;
import com.company.manager.ManagerReserva;
import com.company.view.PantallaMenuPrincipal;

public class Main {

    public static void main(String[] args) {
        ManagerClientes managerClientes = new ManagerClientes();
        ManagerReserva managerReserva = new ManagerReserva();


        PantallaMenuPrincipal pantallaMenuPrincipal = new PantallaMenuPrincipal();
        pantallaMenuPrincipal.iniciar(managerClientes, managerReserva);

    }
}
