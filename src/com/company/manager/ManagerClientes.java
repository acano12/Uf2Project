package com.company.manager;

import com.company.model.Cliente;

import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.UUID;

public class ManagerClientes {
    Scanner scanner = new Scanner(System.in);
    static Cliente[] clientes = new Cliente[4];

    static public void crearCliente(String user, String contraseña,String nombre,String apellidos) {

        Cliente cliente = new Cliente();
        cliente.username = user;
        cliente.password = contraseña;
        cliente.nombre = nombre;
       cliente.apellido = apellidos;


        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente;
                break;
            }
        }
    }




        static public String signIn(String nombre, String pass){
            for (int i = 0; i < clientes.length; i++) {
                if (clientes[i] != null && nombre.equals(clientes[i].username) && pass.equals(clientes[i].password)) {
                    return "ok";

                }
            }
            return "nok";
        }

    static public class generadorUUID {

       static public  String crearUUID() {

            return java.util.UUID.randomUUID().toString();
        }

    }



    }
