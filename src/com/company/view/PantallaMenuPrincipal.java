package com.company.view;

import com.company.manager.ManagerClientes;

import java.util.Scanner;

public class PantallaMenuPrincipal {

    public void iniciar(ManagerClientes managerClientes){
        System.out.println("\033[104;97mMyApp :: Menu principal\033[0m");
        System.out.println("a) Registrarse");
        System.out.println("b) Acceder");

        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();

        if("a".equals(opcion)){
            PantallaRegistroClientes pantallaRegistro = new PantallaRegistroClientes();
            pantallaRegistro.iniciar(managerClientes);
        } else if("b".equals(opcion)){
            PantallaAcceder pantallaAcceder = new PantallaAcceder();
            pantallaAcceder.iniciar(managerClientes);
        }
    }
}
