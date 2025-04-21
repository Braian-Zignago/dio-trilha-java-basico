package edu.project.banco.service;

import edu.project.banco.model.Banco;
import edu.project.banco.model.Cliente;
import edu.project.banco.model.Cuenta;
import edu.project.banco.util.ValidadorNumeroCuenta;

import java.util.Locale;
import java.util.Scanner;

public class GestorCuenta {

    public void crearCuenta(Banco bank, Cliente client) {
        ValidadorNumeroCuenta val = new ValidadorNumeroCuenta();
        String numeroCuenta = val.numeroCuenta(bank, client);
        Cuenta cuenta = new Cuenta(client, numeroCuenta);
        client.agregarCuenta(cuenta);
        bank.agregarCuenta(cuenta);
    }

    public void depositar(Cuenta cuenta) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Hola " + cuenta.getPROPIETARIO().getNombre() + ". Ingrese el valor del deposito: $");
        double monto = input.nextDouble();
        input.nextLine();
        cuenta.depositar(monto);

    }

    public void sacar(Cuenta cuenta) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Hola " + cuenta.getPROPIETARIO().getNombre() + ". Ingrese el valor del retiro: $");
        double monto = input.nextDouble();
        input.nextLine();
        if (cuenta.retirar(monto)) {
            System.out.println("Todo correcto...");
        } else {
            System.out.println("Saldo insufieciente....");
        }
    }
}
