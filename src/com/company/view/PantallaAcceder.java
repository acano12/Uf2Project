package com.company.view;

import com.company.manager.ManagerClientes;

import java.util.Scanner;

public class PantallaAcceder {
    public void iniciar(ManagerClientes managerClientes){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\033[104;97mMyApp :: Acceder\033[0m");

        System.out.println("Usuario:");
        String usuario = scanner.nextLine();

        System.out.println("Password:");
        String password = scanner.nextLine();


        String resultado = managerClientes.verificar(usuario, password);

        if(resultado.equals("ok")){
            PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
            pantallaPrincipal.iniciar();
        }
        if(resultado.equals("nok")){
            PantallaMenuPrincipal pantallaMenuPrincipal = new PantallaMenuPrincipal();
            pantallaMenuPrincipal.iniciar(managerClientes);
        }
    }
}
