package edu.project.banco.model;

import java.util.HashSet;

public class Banco {
    private String nombre;
    HashSet<Cuenta> cuentas = new HashSet<>();
    Cliente pedro = new Cliente("Pedro", "9012121-9");


    public Banco(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCuenta(Cuenta cuenta){
        this.cuentas.add(cuenta);
    }
    public Cuenta buscarCuenta(String numeroCuenta){
        Cliente AAA = new Cliente("AAA", "AAA");
        Cuenta cuenta;
        Cuenta interCuenta = new Cuenta(AAA, "0");
        for (Cuenta c : this.cuentas) {
            if (c.getNUMERO_CUENTA().contains(numeroCuenta)){
                interCuenta = c;
                break;
            }

        }
        cuenta = interCuenta;
       return cuenta;
    }

    public HashSet<Cuenta> getCuentas() {
        return cuentas;
    }

    public String getNombre() {
        return nombre;
    }
}
