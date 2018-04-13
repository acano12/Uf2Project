package com.company.manager;
import com.company.model.Habitacion;
import com.company.model.Reserva;
import com.company.utils.Utils;

public class ManagerReserva {
    static public int comprobar ( int any, int mes, int dia){
        Reserva reserva = new Reserva();
        if (any > Utils.getAny()) {
            return 0;
        }else   if (any < Utils.getAny()) {
            System.out.println("Este año no es valido, es anterior al actual.");
            return 1;
        }else   if (any == Utils.getAny() && mes < Utils.getMes()){
                System.out.println("Este mes no es valido");
                return 1;
        }else   if (any == Utils.getAny() && mes == Utils.getMes() && dia < Utils.getMes()) {
                System.out.println("Este dia no es valido");
                return 1;
            }else
        return 0;
    }


//    public static Habitacion[] getHabitacionesLibres(int any, int mes, int dia){
//
//
//        return false
    }

