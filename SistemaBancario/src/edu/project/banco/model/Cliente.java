package edu.project.banco.model;

import java.util.HashSet;

public class Cliente {
    private String nombre;
    private final String ID;
    HashSet<Cuenta> cuentas;

    public Cliente(String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public void agregarCuenta(Cuenta cuenta){

    }

    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    public HashSet<Cuenta> getCuentas() {
        return cuentas;
    }
}
