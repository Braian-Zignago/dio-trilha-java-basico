package edu.project.banco.util;

import edu.project.banco.model.Banco;
import edu.project.banco.model.Cliente;
import edu.project.banco.model.Cuenta;

import java.util.HashSet;
import java.util.Random;

public class ValidadorNumeroCuenta {
    Cuenta cuenta;
    Random rand = new Random();


    public String numeroCuenta(Banco banco, Cliente cliente) {
        boolean yes = false;
        String numeroCuenta = "";
        HashSet<String> cuentas = new HashSet<>();
        for (Cuenta cuenta : banco.getCuentas()) {
            cuentas.add(cuenta.getNUMERO_CUENTA());
        }

        do {
            numeroCuenta = "";
            int nCuentasCliente = !(cliente.getCuentas() == null) ? cliente.getCuentas().size() : 0;
            for (int i = 0; i < 8; i++) {
                int numeroAleatorio = rand.nextInt(10) + 0;
                numeroCuenta += Integer.toString(numeroAleatorio);
            }
            numeroCuenta += "-";
            numeroCuenta += Integer.toString(nCuentasCliente);
            String aux = numeroCuenta;
            System.out.println(numeroCuenta);
            yes = ((banco.getCuentas() == null)) ? true : !(cuentas.contains(numeroCuenta));
        } while (yes == false);

        return numeroCuenta;
    }
}
