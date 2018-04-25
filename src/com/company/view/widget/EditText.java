package com.company.view.widget;

import java.util.Scanner;

public class EditText {
    public String read(String hint){
        System.out.println(hint);
        return new Scanner(System.in).nextLine();
    }

    public int readInt(String hint){
        System.out.println(hint);
        return new Scanner(System.in).nextInt();
    }

    public String readDate(String hint){
        System.out.println(hint);
        return new Scanner(System.in).nextLine();

    }
}
