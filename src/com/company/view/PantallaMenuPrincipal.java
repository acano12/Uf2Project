package com.company.view;

import com.company.manager.ManagerClientes;
import com.company.manager.ManagerReserva;

import java.util.Scanner;

public class PantallaMenuPrincipal {

    public void iniciar(ManagerClientes managerClientes, ManagerReserva managerReserva){
        System.out.println("\033[104;97mPENSIÓN SAN JUSTO :: Menu principal\033[0m");
        System.out.println("a) Registrarse");
        System.out.println("b) Acceder");
        System.out.println("c) Salir");

        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();

        if("a".equals(opcion)){
            PantallaRegistroClientes pantallaRegistro = new PantallaRegistroClientes();
            pantallaRegistro.iniciar(managerClientes, managerReserva);
        } else if("b".equals(opcion)){
            PantallaAcceder pantallaAcceder = new PantallaAcceder();
            pantallaAcceder.iniciar(managerClientes, managerReserva);
        }else if ("c".equals(opcion)){
            System.out.println("HASTA LUEGO");
            System.exit(0);
        }
    }
}
