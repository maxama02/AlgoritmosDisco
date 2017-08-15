/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Max Alonso Mena Arguedas
 */
public class DatosNecesarios {

    /**
     * @return the tamanoDisco
     */
    public int getTamanoDisco() {
        return tamanoDisco;
    }

    /**
     * @param tamanoDisco the tamanoDisco to set
     */
    public void setTamanoDisco(int tamanoDisco) {
        this.tamanoDisco = tamanoDisco;
    }

    /**
     * @return the posicionCabeza
     */
    public int getPosicionCabeza() {
        return posicionCabeza;
    }

    /**
     * @param posicionCabeza the posicionCabeza to set
     */
    public void setPosicionCabeza(int posicionCabeza) {
        this.posicionCabeza = posicionCabeza;
    }

    /**
     * @return the tareasDisco
     */
    public ArrayList getTareasDisco() {
        return tareasDisco;
    }

    /**
     * @param tareasDisco the tareasDisco to set
     */
    public void setTareasDisco(ArrayList tareasDisco) {
        this.tareasDisco = tareasDisco;
    }
    private int tamanoDisco;
    private int posicionCabeza;
    private ArrayList tareasDisco;
    
    /**
     * Constructor DatosNesarios
     * @param tD Tamano del disco - necesario
     * @param pC Posicion de la cabeza - necesario
     * @param LtD Lista dinamica - necesario
     */
    public DatosNecesarios(int tD, int pC, ArrayList LtD){
        tamanoDisco=tD;
        posicionCabeza= pC;
        tareasDisco=LtD;
    }
    
}
