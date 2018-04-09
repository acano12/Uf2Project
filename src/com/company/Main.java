package com.company;

import com.company.manager.ManagerClientes;
import com.company.manager.ManagerClientes;
import com.company.view.PantallaMenuPrincipal;

public class Main {

    public static void main(String[] args) {
        ManagerClientes managerClientes = new ManagerClientes();


        PantallaMenuPrincipal pantallaMenuPrincipal = new PantallaMenuPrincipal();
        pantallaMenuPrincipal.iniciar(managerClientes);

    }
}
