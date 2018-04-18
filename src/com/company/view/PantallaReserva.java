package com.company.view;


import com.company.manager.ManagerReserva;
import com.company.view.widget.EditText;
import com.company.view.widget.Mensaje;

import java.util.Scanner;



public class PantallaReserva {

    public void reservar() {
        Scanner scanner = new Scanner(System.in);
        Mensaje mensaje = new Mensaje();
        EditText editText = new EditText();

        int any = editText.readInt("AÑO");
        int mes = editText.readInt("MES");
        int dia = editText.readInt("DIA");

        ManagerReserva managerReserva = new ManagerReserva();
        managerReserva.comprobar(any, dia, mes);

        // ManagerReserva.getHabitacionesLibres(any, dia, mes);

        int validar = ManagerReserva.comprobar(any, mes, dia);


        if (validar == 1) {
            mensaje.showError("LO SENTIMOS, RESERVA FECHA NO DISPONIBLE");

            PantallaReserva pantallaReserva = new PantallaReserva();
            pantallaReserva.reservar();
            System.out.println(" ");
        }
           mensaje.showOk("ENHORABUENA, FECHA ACCESIBLE");


    }
}