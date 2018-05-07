package com.company.view;
import com.company.manager.ManagerReserva;
import java.util.Scanner;

public class PantallaSuite {
    public void elegir(int totalDias) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\033[104;97mA) Habitación Aurora (TV TDT, Wifi 5g, Jacuzzi, Jardin, Ducha, Terraza)\033[0m");
        System.out.println("----------------------------");
        System.out.println("\033[104;97mB) Habitación Silvia (TV satelite, Bañera con hidromasaje, WiFi 99g, Piscina, Solarium, Minibar)\033[0m");
        String tipo = scanner.nextLine();

        if ("a".equals(tipo)) {
            System.out.println("El precio de la Habitación es: 250€/noche");
            System.out.println("----------------------------");
            int total250 = 250 * totalDias;
            System.out.println("El precio de la habitacion Aurora en total, es de:\033[104;97m" + total250 + "€\033[0m");

            System.out.println("\033[104;97mQUIERES REALIZAR LA RESERVA? s/n\033[0m");
            String elegir = scanner.nextLine();
            if ("s".equals(elegir)) {
                System.out.println("\033[104;97mRESERVA REALIZADA, HASTA LA PROXIMA.\033[0m");
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
            System.out.println("El precio de la Habitación es: 375€/noche");
            System.out.println("----------------------------");
            int total375 = 375 * totalDias;
            System.out.println("El precio de la habitacion Silvia en total, es de:\033[104;97m" + total375 + "€\033[0m");
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
