package com.company.view;
import com.company.utils.Utils;
import com.company.view.PantallaHabitacionIndividual;
import com.company.manager.ManagerReserva;

import java.util.Scanner;

public class PantallaHabitacionIndividual {
    public void elegir(int totalDias){
        Scanner scanner = new Scanner(System.in);
        System.out.println("A) Habitación Blue (TV,ducha,Terraza)");
        System.out.println("----------------------------");
        System.out.println("B) Habitación Red-Lava (TV,Bañera,WiFi,Terraza,Minibar)");
        String tipo = scanner.nextLine();

        if("a".equals(tipo)){
            ManagerReserva managerReserva = new ManagerReserva();
            System.out.println("El precio de la Habitación será: 30€/noche");
            int total30= 30* totalDias  ;

        System.out.println("El precio de la habitacion blue en total, es de:" + total30 +"€");

        } else if("b".equals(tipo)){
            System.out.println("El precio de la Habitación será: 50€/noche");

        }
    }
}
