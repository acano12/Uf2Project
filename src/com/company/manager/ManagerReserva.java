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
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();

            } else for (int i = 0; i < fecha1.length(); i++) {
                if (i == 2) {
                    i++;
                }
                if (i == 5) {
                    i++;
                }
                if (Character.isAlphabetic(fecha1.charAt(i))) {
                    System.out.println("Has introducido un caracter, no valido");
                    esValido = false;
                    PantallaReserva pantallaReserva = new PantallaReserva();
                    pantallaReserva.reservar();
                    break;
                } else {
                    esValido = true;
                }
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
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            } else for (int i = 0; i < fecha2.length(); i++) {
                if (i == 2) {
                    i++;
                }
                if (i == 5) {
                    i++;
                }
                if (Character.isAlphabetic(fecha2.charAt(i))) {
                    System.out.println("Has introducido un caracter, no valido");
                    esValido = false;
                    PantallaReserva pantallaReserva = new PantallaReserva();
                    pantallaReserva.reservar();
                    break;
                } else {
                    esValido = true;
                }
            }
        }
    }


    static public void fechas(String fecha1, String fecha2) {
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

        //CON ESTO SACAMO EL MES DE SALIDA
        String mes2_1 = String.valueOf(fecha2.charAt(3));
        String mes2_2 = String.valueOf(fecha2.charAt(4));
        String mes2_junto = mes2_1 + mes2_2;
        int mes2 = Integer.parseInt(mes2_junto);

        //CON ESTO SACAMO EL AÑO DE SALIDA
        String any2_1 = String.valueOf(fecha2.charAt(6));
        String any2_2 = String.valueOf(fecha2.charAt(7));
        String any2_3 = String.valueOf(fecha2.charAt(8));
        String any2_4 = String.valueOf(fecha2.charAt(9));
        String any2_junto = any2_1 + any2_2 + any2_3 + any2_4;
        int any2 = Integer.parseInt(any2_junto);

        // AHORA COMPROVAMOS QUE LA FECHA DE ENTRADA SEA INFERIOR A LA DE SALIDA
        boolean esValido = false;
        while (!esValido) {
            if (any1 > any2) {
                System.out.println("Error la fecha de entrada es inferior a la de salida");
                esValido = false;
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            } else if (any1 == any2 && mes1 > mes2) {
                System.out.println("Error la fecha de entrada es inferior a la de salida");
                esValido = false;
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            }
            else if (any1 == any2 && mes1 == mes2 && dia1 > dia2) {
                System.out.println("Error la fecha de entrada es inferior a la de salida");
                esValido = false;
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            }
            else if (any1 == any2 && mes1 == mes2 && dia1 == dia2) {
                System.out.println("Error la fecha de entrada no puede ser la misma fecha que la de salida");
                esValido = false;
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            }


        }
    }
}





    


// PONER QUE LOS DIA SOLO SON VALIDOS DEL 1 AL 30 O DEL 1 AL 31 DEPENDE EL MES O DEL 1 AL 28
// PONER QUE LOS MESES SOLO SE PUEDA DEL 1 AL 12
// PONER QUE EL AÑO TIENE QUE SER IGUAL O SUPERIOR AL ACTUAL.


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

