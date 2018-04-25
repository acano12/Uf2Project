package com.company.view;

import com.company.manager.ManagerClientes;
import com.company.manager.ManagerReserva;
import com.company.model.Cliente;
import com.company.view.PantallaMenuPrincipal;
import com.company.view.widget.EditText;

import java.util.Scanner;

public class PantallaRegistroClientes {

    public void iniciar(){
        Scanner scanner = new Scanner(System.in);

        EditText editText = new EditText();
        System.out.println("----------------------");
        System.out.println("\033[104;97mREGISTRO :: CLIENTES\033[0m");
        System.out.println("----------------------");

        String username = editText.read("NOMBRE DE USUARIO");
        String password = editText.read("CONTRASEÑA:");

        System.out.println("FECHA DE NACIMIENTO");
        System.out.println("----------------------");


        ManagerClientes.crearCliente(username, password);

        PantallaMenuPrincipal pantallaMenuPrincipal = new PantallaMenuPrincipal();
        pantallaMenuPrincipal.iniciar();
    }



}