package com.company.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

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
