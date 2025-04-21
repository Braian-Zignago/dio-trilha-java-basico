package edu.project.banco.service;

import edu.project.banco.model.Banco;
import edu.project.banco.model.Cliente;
import edu.project.banco.model.Cuenta;
import edu.project.banco.util.ValidadorNumeroCuenta;

import java.util.Locale;
import java.util.Scanner;

public class GestorCuenta {
    Scanner  input = new Scanner(System.in).useLocale(Locale.US);
    public void crearCuenta(Banco bank, Cliente client) {
        ValidadorNumeroCuenta val = new ValidadorNumeroCuenta();
        String numeroCuenta = val.numeroCuenta(bank, client);
        Cuenta cuenta = new Cuenta(client, numeroCuenta);
        client.agregarCuenta(cuenta);
        bank.agregarCuenta(cuenta);
    }

    public Cuenta validarCuenta(Banco bank){
        String nCuenta;
        Cuenta cuenta;
        System.out.println("Ingrese numero de cuenta: ");
        nCuenta = input.next();
        cuenta = bank.buscarCuenta(nCuenta);
        if (cuenta.getPROPIETARIO().getNombre() == "AAA") {
            System.out.println("Esta cuenta no existe.");
            cuenta = null;
            return cuenta;
        }
        return cuenta;
    }

    public Cuenta validarCuenta(Banco bank, String nCuenta){
        Cuenta cuenta = bank.buscarCuenta(nCuenta);
        if (cuenta.getPROPIETARIO().getNombre() == "AAA") {
            System.out.println("Esta cuenta no existe.");
            cuenta = null;
            return cuenta;
        }
        return cuenta;
    }

    public void depositar(Cuenta cuenta) {
        System.out.print("Hola " + cuenta.getPROPIETARIO().getNombre() + ". Ingrese el valor del deposito: $");
        double monto = input.nextDouble();
        input.nextLine();
        cuenta.depositar(monto);

    }

    public void sacar(Cuenta cuenta) {
        System.out.print("Hola " + cuenta.getPROPIETARIO().getNombre() + ". Ingrese el valor del retiro: $");
        double monto = input.nextDouble();
        input.nextLine();
        if (cuenta.retirar(monto)) {
            System.out.println("Todo correcto...");
        } else {
            System.out.println("Saldo insufieciente....");
        }
    }

//    public Cuenta[] mostrasCuentasDelCliente(Cliente cliente){
//        Cuenta[] cuenta = null;
//        cliente.
//        return
//    }
}
