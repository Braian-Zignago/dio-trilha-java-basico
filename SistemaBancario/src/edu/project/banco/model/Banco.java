package edu.project.banco.model;

import java.util.HashSet;

public class Banco {
    private String nombre;
    private HashSet<Cuenta> cuentas = new HashSet<>();
    private HashSet<Cliente> clientes = new HashSet<>();


    public Banco(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCuenta(Cuenta cuenta){
        this.cuentas.add(cuenta);
    }

    public Cliente buscarCliene(String id){
        Cliente cliente = null;
        for (Cliente c : this.clientes) {
            if (c.getID().contains(id)){
                cliente = c;
                return cliente;
            }
        }

        return cliente;
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

    public void addClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }
}
