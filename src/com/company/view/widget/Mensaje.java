package com.company.view.widget;

public class Mensaje {

    public void showOk(String mensaje){
        System.out.println("\033[34m"+mensaje+"\033[0m");
    }

    public void showError(String mensaje){
        System.out.println("\033[31m"+mensaje+"\033[0m");
    }
}
