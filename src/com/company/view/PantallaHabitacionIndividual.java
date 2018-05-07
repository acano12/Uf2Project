package com.company.view;
import com.company.utils.Utils;
import com.company.view.PantallaHabitacionIndividual;
import com.company.manager.ManagerReserva;

import java.util.Scanner;

public class PantallaHabitacionIndividual {
    public void elegir(int totalDias) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\033[104;97mA) Habitación Blue (TV,ducha,Terraza)\033[0m");
        System.out.println("----------------------------");
        System.out.println("\033[104;97mB) Habitación Red-Lava (TV,Bañera,WiFi,Terraza,Minibar)\033[0m");
        String tipo = scanner.nextLine();

        if ("a".equals(tipo)) {
            System.out.println("El precio de la Habitación será: 30€/noche");
            System.out.println("----------------------------");
            int total30 = 30 * totalDias;
            System.out.println("El precio de la habitacion Blue en total, es de:" + total30 + "€");

            System.out.println("QUIERES REALIZAR LA RESERVA? s/n");
            String elegir = scanner.nextLine();
            if ("s".equals(elegir)) {
                System.out.println("RESERVA REALIZADA, HASTA LA PROXIMA.");
                System.exit(0);

            } else if ("n".equals(elegir)) {
                System.out.println("Deseas elegir otra fecha? s/n");
                String elegir2 = scanner.nextLine();

                if ("s".equals(elegir2)) {
                    PantallaReserva pantallaReserva = new PantallaReserva();
                    pantallaReserva.reservar();
                } else if ("n".equals(elegir2)) {
                    System.out.println("Hasta la proxima.");
                    System.exit(0);
                }
            }
        }

        if ("b".equals(tipo)) {
            System.out.println("El precio de la Habitación será: 50€/noche");
            System.out.println("----------------------------");

            int total50 = 50 * totalDias;
            System.out.println("El precio de la habitacion Red-Lava en total, es de:\033[104;97m" + total50 + "€\033[0m");
            System.out.println("----------------------------");


            System.out.println("\033[104;97mQUIERES REALIZAR LA RESERVA? s/n\033[0m");
            String elegirb = scanner.nextLine();
            if ("s".equals(elegirb)) {
                System.out.println("\033[104;97mRESERVA REALIZADA, HASTA LA PROXIMA.\033[0m");
                System.exit(0);

            } else if ("n".equals(elegirb)) {
                System.out.println("Deseas elegir otra fecha? s/n");
                String elegirb2 = scanner.nextLine();

                if ("s".equals(elegirb2)) {
                    PantallaReserva pantallaReserva = new PantallaReserva();
                    pantallaReserva.reservar();
                } else if ("n".equals(elegirb2)) {
                    System.out.println("Hasta la proxima.");
                    System.exit(0);
                }
            }
        }
    }
}

