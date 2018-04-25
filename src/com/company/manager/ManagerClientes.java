package com.company.manager;

import com.company.model.Cliente;

import java.security.PublicKey;
import java.util.Scanner;
import java.util.UUID;

public class ManagerClientes {
    Scanner scanner = new Scanner(System.in);
    static Cliente[] clientes = new Cliente[4];
    static String clientId;

    static public void crearCliente(String user, String contraseña) {

        Cliente cliente = new Cliente();
        cliente.id = UUID.randomUUID().toString();
        cliente.username = user;
        cliente.password = contraseña;
//        cliente.nombre = nombre;
//        cliente.apellido = apellidos;
//        cliente.FechaNacimiento = fechaNacimiento;


        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente;
                break;
            }
        }
    }




        static public String signIn (String nombre, String pass){
            for (int i = 0; i < clientes.length; i++) {
                if (clientes[i] != null && nombre.equals(clientes[i].username) && pass.equals(clientes[i].password)) {
                    clientId = clientes[i].id;

                    return "ok";
                }
            }
            return "nok";
        }




    }
