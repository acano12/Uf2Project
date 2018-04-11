package com.company.view;

import com.company.manager.ManagerClientes;
import com.company.manager.ManagerReserva;

import java.util.Scanner;

public class PantallaPrincipal {
    public void iniciar(){
        System.out.println("\033[104;97mPENSIÓN SAN JUSTO :: Principal\033[0m");
        System.out.println("a) Reservar");
        System.out.println("b) Atrás");

        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();

        if("a".equals(opcion)){
            PantallaReserva pantallaReserva = new PantallaReserva();
            pantallaReserva.reservar();
        }
        else if("b".equals(opcion)){
            PantallaMenuPrincipal pantallaMenuPrincipal = new PantallaMenuPrincipal();
            pantallaMenuPrincipal.iniciar();
        }


    }
}
