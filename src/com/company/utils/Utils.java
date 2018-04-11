package com.company.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Utils {
    static public int getDia(){
        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        return ldt.getDayOfMonth();
    }

    static public int getMes() {
        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        return ldt.getMonthValue();
    }

    public static int getAny(){
        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        return ldt.getYear();
    }
}
