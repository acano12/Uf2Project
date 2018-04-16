package com.company.view;

import java.util.Scanner;
import com.company.view.PantallaHabitacionIndividual;

public class PantallaHabitacion {

    public void habitaciones(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\033[104;97mPENSIÓN SAN JUSTO :: Habitaciones\033[0m");

        System.out.println("a) Habitaciones Individuales");
        System.out.println("b) Habitaciones Dobles");
        System.out.println("c) Suites");
        System.out.println("d) Salir");
        String elegir = scanner.nextLine();

        if("a".equals(elegir)){
        PantallaHabitacionIndividual pantallaHabitacionIndividual = new PantallaHabitacionIndividual();

        } else if("b".equals(elegir)){


        } else if("c".equals(elegir)){

        }else if ("d".equals(elegir)){
            System.out.println("HASTA LUEGO");
            System.exit(0);
        }

    }
}
