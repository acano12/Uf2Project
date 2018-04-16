package com.company.view;

import com.company.manager.ManagerClientes;
import com.company.manager.ManagerReserva;

import java.util.Scanner;

public class PantallaAcceder {
    public void iniciar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\033[104;97mPENSIÓN SAN JUSTO :: Acceder\033[0m");

        System.out.println("Usuario:");
        String usuario = scanner.nextLine();

        System.out.println("Password:");
        String password = scanner.nextLine();


        String resultado = ManagerClientes.verificar(usuario, password);

        if(resultado.equals("ok")){
            PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
            pantallaPrincipal.iniciar();
        }
        if(resultado.equals("nok")){
            PantallaMenuPrincipal pantallaMenuPrincipal = new PantallaMenuPrincipal();
            pantallaMenuPrincipal.iniciar();
        }
    }
}