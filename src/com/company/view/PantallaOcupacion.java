package com.company.view;

import com.company.manager.ManagerOcupacion;

import java.util.Scanner;

public class PantallaOcupacion {
    Scanner scanner = new Scanner(System.in);

    public void vista(ManagerOcupacion managerOcupacion){

        System.out.println("Dia");
        int dia = scanner.nextInt();
        System.out.println("mes");
        int mes = scanner.nextInt();
        System.out.println("año");
        int any = scanner.nextInt();


    }
}
