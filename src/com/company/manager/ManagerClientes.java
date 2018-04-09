package com.company.manager;

import com.company.model.Cliente;

public class ManagerClientes {
    Cliente[] usuarios = new Cliente[4];

    public void crearCliente(String nombre, String contraseña){

        Cliente usuario = new Cliente();
        usuario.username = nombre;
        usuario.password = contraseña;

        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i] == null){
                usuarios[i] = usuario;
                break;
            }
        }
    }

    public String verificar(String nombre, String pass){
        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i] != null && nombre.equals(usuarios[i].username) && pass.equals(usuarios[i].password)){
                return "ok";
            }
        }
        return "nok";

    }
}

