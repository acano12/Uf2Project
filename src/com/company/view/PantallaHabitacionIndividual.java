package com.company.view;
import com.company.view.PantallaHabitacionIndividual;


import java.util.Scanner;

public class PantallaHabitacionIndividual {
    public void elegir(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("A) Habitación Blue (TV,ducha,Terraza)");
        System.out.println("----------------------------");
        System.out.println("B) Habitación Red-Lava (TV,Bañera,WiFi,Terraza,Minibar)");
        String tipo = scanner.nextLine();

        if("a".equals(tipo)){
            System.out.println("El precio de la Habitación será: 30€/noche");

        } else if("b".equals(tipo)){
            System.out.println("El precio de la Habitación será: 50€/noche");

        }
    }
}
