package com.company.manager;
import com.company.model.Habitacion;
import com.company.model.Reserva;
import com.company.utils.Utils;

public class ManagerReserva {
    static public int comprobar ( int dia, int mes, int any){
        Reserva reserva = new Reserva();

        if (any < Utils.getAny()) {
            System.out.println("Este año no es valido, es anterior al actual.");
            return 1;

        }
        return 0;

    }


//    public static Habitacion[] getHabitacionesLibres(int any, int mes, int dia){
//
//
//        return false
    }

