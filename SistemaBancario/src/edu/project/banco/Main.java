package edu.project.banco;

import edu.project.banco.model.Banco;
import edu.project.banco.model.Cliente;
import edu.project.banco.model.Cuenta;
import edu.project.banco.service.GestorCuenta;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 1;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Banco bank = new Banco("TUYU");
        Cliente cliente01 = new Cliente("Braian", "1234561221-0");
        Cliente cliente02 = new Cliente("Vitoria", "65325222");
        GestorCuenta gestorCuenta = new GestorCuenta();

        gestorCuenta.crearCuenta(bank, cliente01);
        gestorCuenta.crearCuenta(bank, cliente01);
        gestorCuenta.crearCuenta(bank, cliente02);

        while (true) {
            String nCuenta;
            Cuenta cuenta;

            System.out.println("---Sistema Bancario---");
            System.out.print("1: Depositar.\n2. Sacar.\nInput: ");
            op = input.nextInt();
            input.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Ingrese numero de cuenta: ");
                    nCuenta = input.next();
                    cuenta = bank.buscarCuenta(nCuenta);
                    if (cuenta.getPROPIETARIO().getNombre() == "AAA") {
                        System.out.println("Esta cuenta no existe.");
                        break;
                    }
                    gestorCuenta.depositar(cuenta);
                    System.out.println("Nuevo saldo: " + cuenta.getSaldo());
                    break;
                case 2:
                    System.out.println("Ingrese numero de cuenta: ");
                    nCuenta = input.next();
                    cuenta = bank.buscarCuenta(nCuenta);
                    if (cuenta.getPROPIETARIO().getNombre() == "AAA") {
                        System.out.println("Esta cuenta no existe.");
                        break;
                    }
                    gestorCuenta.sacar(cuenta);
                    System.out.println("Nuevo saldo: " + cuenta.getSaldo());
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
            if (op == 4) {
                System.out.println("Saliendo...");
                break;
            }
        }

    }
}