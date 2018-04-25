package com.company.manager;

import com.company.view.PantallaMenuPrincipal;
import com.company.view.PantallaReserva;

public class ManagerReserva {
    static public void fecha1(String fecha1) {
        boolean esValido = false;
        while (!esValido) {

            if (fecha1.length() != 10) {
                System.out.println("Error la fecha debe tener el formato dd/mm/aaaa");
                esValido = false;
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            } else if (fecha1.charAt(2) != '/' || fecha1.charAt(5) != '/') {
                System.out.println("Separador no valido");
                esValido = false;
            } else {
                esValido = true;
            }
        }

    }
    static public void fecha2(String fecha2) {
        boolean esValido = false;
        while (!esValido) {

            if (fecha2.length() != 10) {
                System.out.println("Error la fecha debe tener el formato dd/mm/aaaa");
                esValido = false;
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            } else if (fecha2.charAt(2) != '/' || fecha2.charAt(5) != '/') {
                System.out.println("Separador no valido");
                esValido = false;
            } else {
                esValido = true;
            }
        }

    }
}

//FALTA QUE NO SE PUEDAN PONER LETRAS, QUE LA FECHA DE INICIO SEA SUPERIOR A LA DE SALIDA
//COMPARAR SI HAY DISPONIBILIDAD DE FECHAS

//    static public void superior(String fecha1, String fecha2) {
//        if (fecha1 < fecha2)
//
//    }
//}

//    static public int comprobar ( int any, int mes, int dia){
//        Reserva reserva = new Reserva();
//
//        if (any > Utils.getAny()) {
//            return 0;
//        }else   if (any < Utils.getAny()) {
//            System.out.println("Este año no  es valido, es anterior al actual.");
//            return 1;
//        }else   if (any == Utils.getAny() && mes < Utils.getMes()){
//            System.out.println("Este mes no es valido");
//            return 1;
//        }else   if (any == Utils.getAny() && mes == Utils.getMes() && dia < Utils.getMes()) {
//            System.out.println("Este dia no es valido");
//            return 1;
//        }else
//            return 0;
//    }


//    public static Habitacion[] getHabitacionesLibres(int any, int mes, int dia){
//
//
//        return false

