package com.company.manager;

import com.company.model.Cliente;
import com.company.view.PantallaClientes;

import java.util.Scanner;

public class ManagerClientes {

    Cliente cliente;
    Cliente[] clientes =new Cliente[100];

    public void crear(String nombre,String apellido, int DiaNacimiento,int MesNacimiento, int AñoNacimiento, int idCliente){
        for (int i = 0; i <clientes.length ; i++) {
            if (clientes[i] ==null){
                clientes[i] = new Cliente();

                clientes[i] = new Cliente();

                clientes[i].nombre = nombre;
                clientes[i].apellido = apellido;
                clientes[i].DiaNacimiento = DiaNacimiento;
                clientes[i].MesNacimiento = MesNacimiento;
                clientes[i].AñoNacimiento = AñoNacimiento;
                clientes[i].idCliente = idCliente;
                idCliente = (int) (Math.random() * 976) + 1;
            }
        }

    }


    public Cliente consultar(){
        return cliente;
    }


}