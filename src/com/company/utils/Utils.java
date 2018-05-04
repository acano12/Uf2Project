package com.company.utils;

import com.company.view.PantallaReserva;

import javax.swing.text.DateFormatter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.DAYS;

public class Utils {
    static public int getDia() {
        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        return ldt.getDayOfMonth();
    }

    static public int getMes() {
        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        return ldt.getMonthValue();
    }

    public static int getAny() {
        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        return ldt.getYear();
    }


    public static int Comprobarfechas(String fecha1, String fecha2) {


        //CON ESTO SACAMOS EL DIA DE ENTRADA
        String dia1_1 = String.valueOf(fecha1.charAt(0));
        String dia1_2 = String.valueOf(fecha1.charAt(1));
        String dia1_junto = dia1_1 + dia1_2;
        int dia1 = Integer.parseInt(dia1_junto);


        //CON ESTO SACAMO EL MES DE ENTRADA
        String mes1_1 = String.valueOf(fecha1.charAt(3));
        String mes1_2 = String.valueOf(fecha1.charAt(4));
        String mes1_junto = mes1_1 + mes1_2;
        int mes1 = Integer.parseInt(mes1_junto);


        //CON ESTO SACAMO EL AÑO DE ENTRADA
        String any1_1 = String.valueOf(fecha1.charAt(6));
        String any1_2 = String.valueOf(fecha1.charAt(7));
        String any1_3 = String.valueOf(fecha1.charAt(8));
        String any1_4 = String.valueOf(fecha1.charAt(9));
        String any1_junto = any1_1 + any1_2 + any1_3 + any1_4;
        int any1 = Integer.parseInt(any1_junto);


        //CON ESTO SACAMOS EL DIA DE SALIDA
        String dia2_1 = String.valueOf(fecha2.charAt(0));
        String dia2_2 = String.valueOf(fecha2.charAt(1));
        String dia2_junto = dia2_1 + dia2_2;
        int dia2 = Integer.parseInt(dia2_junto);
        if (dia2 < 1 || dia2 > 31) {
            System.out.println("Dia no valido, recuerde que este mes tiene del 1 al 31");
            PantallaReserva pantallaReserva = new PantallaReserva();
            pantallaReserva.reservar();
        }

        //CON ESTO SACAMO EL MES DE SALIDA
        String mes2_1 = String.valueOf(fecha2.charAt(3));
        String mes2_2 = String.valueOf(fecha2.charAt(4));
        String mes2_junto = mes2_1 + mes2_2;
        int mes2 = Integer.parseInt(mes2_junto);
        if (mes2 < 1 || mes2 > 12) {
            System.out.println("Mes no valido, recuerde que los meses van del 1 al 12");
            PantallaReserva pantallaReserva = new PantallaReserva();
            pantallaReserva.reservar();
        }

        //CON ESTO SACAMO EL AÑO DE SALIDA
        String any2_1 = String.valueOf(fecha2.charAt(6));
        String any2_2 = String.valueOf(fecha2.charAt(7));
        String any2_3 = String.valueOf(fecha2.charAt(8));
        String any2_4 = String.valueOf(fecha2.charAt(9));
        String any2_junto = any2_1 + any2_2 + any2_3 + any2_4;
        int any2 = Integer.parseInt(any2_junto);

        //CALCULO DE NOCHES EN TOTAL.

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse(fecha1, dateTimeFormatter);
        LocalDate localDate2 = LocalDate.parse(fecha2, dateTimeFormatter);

        int dias = (int) DAYS.between(localDate1, localDate2);

        int totalDias = dias -1;
        return totalDias;
    }


}



//    public boolean overlapDates(String f1Inicio, String f1Fin, String f2Ini, String f2Fin) {
//        if(compararFechas(f1Fin, f2Ini)){
//            return true;
//        } else if (compararFechas(f2Fin,f1Inicio)){
//            return true;
//        }
//        return false;
//    }

//    public static boolean compararFechas(String f1, String f2) {
//
//        try {
//            String[] partesF1 = f1.split("/");
//            String[] partesF2 = f2.split("/");
//            int diaF1 = Integer.parseInt(partesF1[0]);
//            int mesF1 = Integer.parseInt(partesF1[1]);
//            int anyF1 = Integer.parseInt(partesF1[2]);
//            int diaF2 = Integer.parseInt(partesF1[0]);
//            int mesF2 = Integer.parseInt(partesF1[1]);
//            int anyF2 = Integer.parseInt(partesF1[2]);
//
//            if(anyF1 > anyF2){
//                return true;
//            }else if (anyF1 == anyF2 && mesF1 > mesF2){
//                return true;
//            }else if (anyF1== anyF2 && mesF1 == mesF2 && diaF1 > diaF2){
//                return true;
//            }else if (anyF1 == anyF2){
//            }
//
//        } catch (Exception e) {
//            return false;
//        }
//
//
//        return false;
//    }
//
//}
