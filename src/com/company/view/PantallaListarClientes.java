package com.company.view;

import com.company.manager.ManagerClientes;

import java.util.Scanner;

public class PantallaListarClientes {

    public void listar(ManagerClientes managerClientes){
        System.out.println("LISTA DE CLIENTES");

        managerClientes.consultar();
    }
}
