package edu.project.banco.service;

import edu.project.banco.model.Cuenta;
import edu.project.banco.model.Transacion;

public class GestorTransacciones {

    public void transacion(double monto, Cuenta cuentaOrigen, Cuenta cuentaDestino){
        Transacion transacion = new Transacion(monto,"Sueldo", cuentaOrigen, cuentaDestino);
        if (!transacion.ejecutar()){
            System.out.println("Error, Saldo insuficiente en cuenta de origen. ");
        }
        else {
            System.out.println("Trensaccion concluida con suceso.");
        }

    }
}
