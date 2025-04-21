package edu.project.banco.model;

public class Transacion {
    private String id;
    private double monto;
    private String tipo;
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;

    public Transacion(double monto, String tipo, Cuenta cuentaOrigen, Cuenta cuentaDestino) {
        this.monto = monto;
        this.tipo = tipo;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
    }

    public boolean ejecutar(){
        if (this.cuentaOrigen.retirar(monto)){
            this.cuentaDestino.depositar(monto);
            return true;
        }
        return false;
    }
}
