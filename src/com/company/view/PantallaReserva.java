package com.company.view;

import com.company.manager.ManagerClientes;
import com.company.manager.ManagerHabitacion;
import com.company.manager.ManagerOcupacion;
import com.company.manager.ManagerReserva;

import java.util.Scanner;



public class PantallaReserva {

    public void reservar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("año");
        int any = scanner.nextInt();

        System.out.println("mes");
        int mes = scanner.nextInt();

        System.out.println("Dia");
        int dia = scanner.nextInt();
        ManagerReserva managerReserva = new ManagerReserva();
        managerReserva.comprobar(any, dia, mes);

        // ManagerReserva.getHabitacionesLibres(any, dia, mes);

        int validar = ManagerReserva.comprobar(any, mes, dia);


        if (validar == 1) {
            System.out.println("MAAL RESERVA NO HECHA");

            PantallaReserva pantallaReserva = new PantallaReserva();
            pantallaReserva.reservar();
            System.out.println(" ");
        }
        System.out.println("BIEEN RESERVA HECHA");


    }
    }
