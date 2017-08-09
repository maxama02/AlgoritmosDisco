/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planificaciondisco;

/**
 * 2017 - Sistemas Operativos
 *
 * @author Max Alonso Mena Arguedas
 */
public class PlanificacionDisco {

    /**
     * @param args Clase principal necesaria para iniciar el programa
     */
    public static void main(String[] args) {
        //Se invoca la primer pantalla
        DatosPlanificacionDiscos v = new DatosPlanificacionDiscos();
        v.setSize(200, 200);
        v.setVisible(true);
    }

}
