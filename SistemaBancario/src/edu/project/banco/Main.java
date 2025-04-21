package edu.project.banco;

import edu.project.banco.model.Banco;
import edu.project.banco.model.Cliente;
import edu.project.banco.model.Cuenta;
import edu.project.banco.service.GestorCuenta;
import edu.project.banco.service.GestorTransacciones;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 1;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Banco bank = new Banco("TUYU");
        Cliente cliente01 = new Cliente("Braian", "1");
        Cliente cliente02 = new Cliente("Vitoria", "2");
        bank.addClientes(cliente01);
        bank.addClientes(cliente02);
        GestorCuenta gestorCuenta = new GestorCuenta();
        GestorTransacciones gestorTransacciones = new GestorTransacciones();

        gestorCuenta.crearCuenta(bank, cliente01);
        gestorCuenta.crearCuenta(bank, cliente01);
        gestorCuenta.crearCuenta(bank, cliente02);

        while (true) {
            String nCuenta;
            Cuenta cuenta;

            System.out.println("---Sistema Bancario---");
            System.out.print("1: Depositar.\n2. Sacar.\n3: PIX.\nInput: ");
            op = input.nextInt();
            input.nextLine();
            switch (op) {
                case 1:
                    cuenta = gestorCuenta.validarCuenta(bank);
                    if (cuenta == null) {
                        System.out.println("Error. Cuenta inexistente!");
                        break;
                    }
                    gestorCuenta.depositar(cuenta);
                    System.out.println("Nuevo saldo: " + cuenta.getSaldo());
                    break;
                case 2:
                    cuenta = gestorCuenta.validarCuenta(bank);
                    gestorCuenta.sacar(cuenta);
                    System.out.println("Nuevo saldo: " + cuenta.getSaldo());
                    break;
                case 3:
                    System.out.println("Ingrese numero de cuentaOrigen: ");
                    nCuenta = input.next();
                    cuenta = gestorCuenta.validarCuenta(bank, nCuenta);
                    if (cuenta == null) {
                        System.out.println("Error. Cuenta Origen no encontrada.");
                        break;
                    }
                    System.out.println("Ingrese numero de cuentaDestino: ");
                    nCuenta = input.next();
                    Cuenta cuenta2 = gestorCuenta.validarCuenta(bank, nCuenta);
                    if (cuenta2 == null) {
                        System.out.println("Error. Cuenta destino no encontrada.");
                        break;
                    }
                    System.out.print("Ingrese monto de la transeferncia: $");
                    double monto = input.nextDouble();
                    input.nextLine();
                    gestorTransacciones.transacion(monto, cuenta, cuenta2);
                    break;
                case 4:
                    int num = 0;
                    System.out.print("Ingrese su ID para listar sus cuentas: ");
                    String id = input.next();
                    Cliente cliente = bank.buscarCliene(id);
                    HashSet<Cuenta> listCuentas = cliente.getCuentas();
                    System.out.println("Sus cuentas son: ");
                    for (Cuenta listCuenta : listCuentas) {
                        num++;
                        System.out.println(num + "# " + listCuenta + ". Saldo: $"+ listCuenta.getSaldo());
                    }
                    break;
                case 5:
                    break;
            }
            if (op == 5) {
                System.out.println("Saliendo...");
                break;
            }
        }

    }
}