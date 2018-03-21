
package com.company;

import com.company.manager.ManagerClientes;
import com.company.view.PantallaClientes;
import com.company.view.PantallaListarClientes;

public class Main {

    public static void main(String[] args) {

        //CLIENTES
        ManagerClientes managerClientes = new ManagerClientes();
        PantallaClientes pantallaClientes = new PantallaClientes();
        pantallaClientes.mostrar(managerClientes);
        PantallaListarClientes pantallaListarClientes = new PantallaListarClientes();
        pantallaListarClientes.listar(managerClientes);
////        Habitacion habitacionDoble = new Habitacion();
////
////        Habitacion habitacionExecutive = new Habitacion();
////
////        Habitacion suite = new Habitacion();
////
////        //HABITACION-INDIVIDUAL//
////
////        Habitacion habitacionIndividual_Blue = new Habitacion();
////        habitacionIndividual_Blue.asignarNumerodeCamasIndividuales(3);
////        habitacionIndividual_Blue.vistas=true;
////        habitacionIndividual_Blue.bañoPublico=true;
////
////        Habitacion habitacionIndividual_RedLava = new Habitacion();
////        habitacionIndividual_RedLava.asignarNumerodeCamasIndividuales(2);
////        habitacionIndividual_RedLava.vistas=true;
////        habitacionIndividual_RedLava.bañoPrivado=true;
////        habitacionIndividual_RedLava.wifi=true;



    }
}
