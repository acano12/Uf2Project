package com.company.view;


import com.company.manager.ManagerReserva;
import com.company.utils.Utils;
import com.company.view.widget.EditText;
import com.company.view.widget.Mensaje;

import java.util.Scanner;

public class PantallaReserva {

    public void reservar() {
        Scanner scanner = new Scanner(System.in);
        Mensaje mensaje = new Mensaje();
        String fecha2 = "";
        EditText editText = new EditText();
        String fecha1 = editText.read("Escoja fecha de entrada");

        ManagerReserva managerReserva = new ManagerReserva();
        managerReserva.fecha1(fecha1);
        managerReserva.fechaAtual(fecha1);
        fecha2 = editText.read("Escoja fecha de salida");
        managerReserva.fecha2(fecha2);
        managerReserva.comprobarDisponibilidad(fecha1, fecha2);
        int totalDias = Utils.Comprobarfechas(fecha1, fecha2);
                PantallaHabitacion pantallaHabitacion = new PantallaHabitacion();
        pantallaHabitacion.habitaciones(totalDias);

    }
}
//        String f1Inicio;
//
//
//        ManagerReserva managerReserva = new ManagerReserva();
////        managerReserva.comprobar(fecha);
////
//        // ManagerReserva.getHabitacionesLibres(any, dia, mes);
//
//        int validar = ManagerReserva.comprobar(100,1,1);
//
//
//        if (validar == 1) {
//            mensaje.showError("LO SENTIMOS, RESERVA FECHA NO DISPONIBLE");
//
//            PantallaReserva pantallaReserva = new PantallaReserva();
//            pantallaReserva.reservar();
//            System.out.println(" ");
//        }
//           mensaje.showOk("ENHORABUENA, FECHA ACCESIBLE");
//
//        System.out.println(" ");
//            PantallaHabitacion pantallaHabitacion = new PantallaHabitacion();
//            pantallaHabitacion.habitaciones();
//
//
//    }
//}