package com.company.manager;

import com.company.utils.Utils;
import com.company.view.PantallaMenuPrincipal;
import com.company.view.PantallaReserva;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


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
                break;
            } else if (fecha2.charAt(2) != '/' || fecha2.charAt(5) != '/') {
                System.out.println("Separador no valido");
                esValido = false;
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
                break;
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
                    break;
                }
            }
        }
    }


    static public void fechaAtual(String fecha1) {

        Date fechaActual = new Date();
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Calendar fecha = Calendar.getInstance();
        int any = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);

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
        if (mes1 < 1 || mes1 > 12){
            System.out.println("Mes no valido, recuerde que los meses van del 1 al 12");
            PantallaReserva pantallaReserva = new PantallaReserva();
            pantallaReserva.reservar();
        }
        if (mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 || mes1 == 12){
            if (dia1 < 1 || dia1 > 31) {
                System.out.println("Dia no valido, recuerde que este mes tiene del 1 al 31");
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            }
        }else if (mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11 ){
            if (dia1 < 1 || dia1 > 30) {
                System.out.println("Dia no valido, recuerde que este mes tiene del 1 al 30");
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            }

        } else if (mes1 == 2){
            if (dia1 < 1 || dia1 > 28) {
                System.out.println("Dia no valido, recuerde que este mes tiene del 1 al 28");
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            }
        }



        boolean esValido = false;
        while (!esValido) {
            if (any1 < any) {
                System.out.println("Esta fecha es anterior a la actual, ponga otra fecha, gracias");
                esValido = false;
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();

            } else if (any1 == any && mes1 < mes) {
                System.out.println("Esta fecha es anterior a la actual, ponga otra fecha, gracias");
                esValido = false;
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            } else if (any1 == any && mes1 == mes && dia1 < dia) {
                System.out.println("Esta fecha es anterior a la actual, ponga otra fecha, gracias");
                esValido = false;
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            } else if (any1 == any && mes1 == mes && dia1 == dia) {
                System.out.println("Esta fecha es la misma que hoy, y no se puede reservar en el mismo dia");
                esValido = false;
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();

            }else esValido = true;
            break;
        }
    }

    static public void comprobarDisponibilidad(String fecha1, String fecha2) {

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
        if (mes2 < 1 || mes2 > 12){
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

        if (mes2 < 1 || mes2 > 12){
            System.out.println("Mes no valido, recuerde que los meses van del 1 al 12");
            PantallaReserva pantallaReserva = new PantallaReserva();
            pantallaReserva.reservar();
        }
        if (mes2 == 1 || mes2 == 3 || mes2 == 5 || mes2 == 7 || mes2 == 8 || mes2 == 10 || mes2 == 12){
            if (dia2 < 1 || dia2 > 31) {
                System.out.println("Dia no valido, recuerde que este mes tiene del 1 al 31");
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            }
        }else if (mes2 == 4 || mes2 == 6 || mes2 == 9 || mes2 == 11 ){
            if (dia2 < 1 || dia2 > 30) {
                System.out.println("Dia no valido, recuerde que este mes tiene del 1 al 30");
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            }

        } else if (mes2 == 2){
            if (dia2 < 1 || dia2 > 28) {
                System.out.println("Dia no valido, recuerde que este mes tiene del 1 al 28");
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            }
        }


        // AHORA COMPROVAMOS QUE LA FECHA DE ENTRADA SEA INFERIOR A LA DE SALIDA
        boolean esValido = false;
        while (!esValido) {

        if (any1 > any2) {
                System.out.println("Error la fecha de entrada es superior a la de salida");
                esValido = false;
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            } else if (any1 == any2 && mes1 > mes2) {
                System.out.println("Error la fecha de entrada es superior a la de salida");
                esValido = false;
                PantallaReserva pantallaReserva = new PantallaReserva();
                pantallaReserva.reservar();
            }
            else if (any1 == any2 && mes1 == mes2 && dia1 > dia2) {
                System.out.println("Error la fecha de entrada es superio a la de salida");
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
            else esValido= true;
        break;
            }

        }

    }

