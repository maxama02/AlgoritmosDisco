/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 * Incluir las solicitudes de disco
 * @author Max Alonso
 */
public class Solicitudes {

    /**
     * @return the datoDisco
     */
    public int getDatoDisco() {
        return datoDisco;
    }

    /**
     * @param datoDisco the datoDisco to set
     */
    public void setDatoDisco(int datoDisco) {
        this.datoDisco = datoDisco;
    }
    private int datoDisco=0;
    public Solicitudes(int data){
        datoDisco=data;
    }
  
    
}
