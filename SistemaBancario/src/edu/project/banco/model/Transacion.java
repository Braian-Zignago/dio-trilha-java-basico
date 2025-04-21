package edu.project.banco.model;

public class Transacion {
    private String id;
    private double monto;
    private String tipo;
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;

    public Transacion(String id, double monto, String tipo, Cuenta cuentaOrigen, Cuenta cuentaDestino) {
        this.id = id;
        this.monto = monto;
        this.tipo = tipo;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
    }

    public void ejecutar(){

    }
}
