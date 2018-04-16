package com.company.model;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Reserva {
    LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
    public int diaActual = ldt.getDayOfMonth();
    public int mesActual = ldt.getMonthValue();
    public int añoActual = ldt.getYear();

}
