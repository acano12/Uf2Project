package com.company.view;

import com.company.manager.ManagerClientes;
import com.company.manager.ManagerReserva;
import com.company.model.Cliente;

import java.util.Scanner;

public class PantallaRegistroClientes {

    public void iniciar(ManagerClientes managerClientes, ManagerReserva managerReserva){
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("\033[104;97mPENSIÓN SAN JUSTO :: Menu principal\033[0m");
        System.out.println("----------------------");
        System.out.println("NOMBRE DE USUARIO   ");
        String username = scanner.nextLine();
        System.out.println("CONTRASEÑA  ");
        String password =scanner.nextLine();
        System.out.println("----------------------");
        System.out.println(" DATOS PERSONALES");
        System.out.println("----------------------");
        System.out.println("NOMBRE");
        String nombre = scanner.nextLine();
        System.out.println("APELLIDOS");
        String apellidos = scanner.nextLine();
        System.out.println("FECHA DE NACIMIENTO");
        System.out.println();
        System.out.println("Dia de nacimiento:");
        int DiaNacimiento = scanner.nextInt();
        System.out.println("Mes de nacimiento:");
        int MesNacimiento = scanner.nextInt();
        System.out.println("Año de nacimiento:");
        int AñoNacimiento = scanner.nextInt();

        managerClientes.crearCliente(username,password,nombre, apellidos,DiaNacimiento,MesNacimiento,AñoNacimiento);

        PantallaMenuPrincipal pantallaMenuPrincipal = new PantallaMenuPrincipal();
        pantallaMenuPrincipal.iniciar(managerClientes, managerReserva);
    }

}
