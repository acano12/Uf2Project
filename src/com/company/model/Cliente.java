package com.company.model;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Cliente {
    LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());

    public String id;

    public String username;
    public String password;
    public String nombre;
    public String apellido;
    //public String fechaNacimiento;

    public int añoActual = ldt.getYear();
    public int mesActual = ldt.getMonthValue();
    public int diaActual = ldt.getDayOfMonth();
}