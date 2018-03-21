package com.company.view;

import com.company.manager.ManagerClientes;
import com.company.model.Cliente;

import java.util.Scanner;

public class PantallaClientes {

    public void mostrar(ManagerClientes managerClientes){
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("      CLIENTE         ");
        System.out.println("----------------------");
        System.out.println("INTRODUCE TU NOMBRE   ");
        String nombre = scanner.nextLine();
        System.out.println("INTRODUCE TUS APELLIDOS ");
        String apellido = scanner.nextLine();
        System.out.println("FECHA DE NACIMIENTO");
        System.out.println("----------------------");
        System.out.println("Dia de nacimiento:");
        int DiaNacimiento = scanner.nextInt();
        System.out.println("Mes de nacimiento:");
        int MesNacimiento = scanner.nextInt();
        System.out.println("Año de nacimiento:");
        int AñoNacimiento = scanner.nextInt();
//        System.out.println();
//        System.out.println("------------------------------------");
//        System.out.println("FICHA DEL CLIENTE");
//        System.out.println("------------------------------------");
//        System.out.println("NOMBRE: "+ nombre);
//        System.out.println("APELLIDO: "+ apellido);
//        System.out.println("Fecha de nacimiento: " + DiaNacimiento + "/" + MesNacimiento + "/"+ AñoNacimiento);
//        System.out.println("-------------------------------------");

    }

}
