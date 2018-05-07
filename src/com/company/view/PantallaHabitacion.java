package com.company.view;

import java.util.Scanner;

public class PantallaHabitacion {

    public void habitaciones(int totalDias){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\033[104;97mPENSIÓN SAN JUSTO >> Habitaciones\033[0m");

        System.out.println("a) Habitaciones Individuales");
        System.out.println("b) Habitaciones Dobles");
        System.out.println("c) Suites");
        System.out.println("d) Salir");
        String elegir = scanner.nextLine();

        if("a".equals(elegir)){
        PantallaHabitacionIndividual pantallaHabitacionIndividual = new PantallaHabitacionIndividual();
            pantallaHabitacionIndividual.elegir(totalDias);
        } else if("b".equals(elegir)){
            PantallaHabitacionDoble pantallaHabitacionDoble = new PantallaHabitacionDoble();
            pantallaHabitacionDoble.elegir(totalDias);
        } else if("c".equals(elegir)){
            PantallaSuite pantallaSuite = new PantallaSuite();
            pantallaSuite.elegir(totalDias);
        }else if ("d".equals(elegir)){
            System.out.println("HASTA LUEGO");
            System.exit(0);
        }

    }
}
