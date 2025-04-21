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

    }

    public boolean retirar(double monto){

        return true;
    }

    public String getNUMERO_CUENTA() {
        return NUMERO_CUENTA;
    }

    public double getSaldo() {
        return saldo;
    }
}
