package com.company.model;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Reserva {
    LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
    public int año = ldt.getYear();
    public int mes = ldt.getMonthValue();
    public int dia = ldt.getDayOfMonth();
    int clientID;
    int habID;
}