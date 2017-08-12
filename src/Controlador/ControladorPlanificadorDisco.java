/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ControladorPlanificadorDisco {

    /**
     * Declaracion de variables
     */
    ArrayList listaSolicitudes;

    /**
     * Constructor de la clase
     */
    public ControladorPlanificadorDisco() {
        listaSolicitudes = new ArrayList();
    }

    public void AgregaDatosLista(int dato) {
        listaSolicitudes.add(dato);
    }

    public ArrayList RetornaDatoslista() {

        if (!listaSolicitudes.isEmpty()) {
            return listaSolicitudes;
        }

        return null;
    }

}
