package com.company.view;

import com.company.manager.ManagerClientes;
import com.company.manager.ManagerReserva;
import com.company.model.Cliente;
import com.company.view.PantallaMenuPrincipal;

import java.util.Scanner;

public class PantallaRegistroClientes {

    public void iniciar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("\033[104;97REGISTRO :: CLIENTES\033[0m");
        System.out.println("----------------------");
        System.out.println("NOMBRE DE USUARIO   ");
        String username = scanner.nextLine();
        System.out.println("CONTRASEÑA  ");
        String password =scanner.nextLine();

        System.out.println("FECHA DE NACIMIENTO");
        System.out.println("----------------------");
        System.out.println("Dia de nacimiento:");
        int DiaNacimiento = scanner.nextInt();
        System.out.println("Mes de nacimiento:");
        int MesNacimiento = scanner.nextInt();
        System.out.println("Año de nacimiento:");
        int AñoNacimiento = scanner.nextInt();

        ManagerClientes.crearCliente(username, password, DiaNacimiento, MesNacimiento, AñoNacimiento);

        PantallaMenuPrincipal pantallaMenuPrincipal = new PantallaMenuPrincipal();
        pantallaMenuPrincipal.iniciar();
    }



}
