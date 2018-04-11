package com.company.manager;

import com.company.model.Cliente;

public class ManagerClientes {
    static Cliente[] clientes = new Cliente[4];

    static public void crearCliente(String user, String contraseña,String nombre, String apellidos, int dia, int mes, int any){

        Cliente cliente = new Cliente();
        cliente.username = user;
        cliente.password = contraseña;
        cliente.nombre = nombre;
        cliente.apellido = apellidos;
        cliente.DiaNacimiento = dia;
        cliente.MesNacimiento = mes;
        cliente.AñoNacimiento = any;

        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i] == null){
                clientes[i] = cliente;

                break;
            }
        }
    }

    static public String verificar(String nombre, String pass){
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i] != null && nombre.equals(clientes[i].username) && pass.equals(clientes[i].password)){
                return "ok";
            }
        }
        return "nok";

    }
}

