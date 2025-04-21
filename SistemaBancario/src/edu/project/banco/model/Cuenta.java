package edu.project.banco.model;

import java.util.PrimitiveIterator;

public class Cuenta {
    private final String NUMERO_CUENTA;
    private double saldo;
    private final Cliente PROPIETARIO;
    private final String TIPO_CUENTA = "Cuenta Corriente";

    public Cuenta(Cliente titular, String numeroCuenta){
        this.NUMERO_CUENTA = numeroCuenta;
        this.PROPIETARIO = titular;
    }

    public void depositar(double monto){
        this.saldo = monto;

    }

    public boolean retirar(double monto){
        boolean yes = true;
        if (this.saldo >= monto){
            this.saldo -= monto;
        } else{
            yes = false;
        }
        return yes;
    }

    public String getNUMERO_CUENTA() {
        return NUMERO_CUENTA;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getPROPIETARIO() {
        return PROPIETARIO;
    }
}
