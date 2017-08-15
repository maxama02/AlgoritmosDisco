/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author ADMIN
 */
public class Disco {

    /**
     * @return the Data
     */
    public int getData() {
        return Data;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(int Data) {
        this.Data = Data;
    }
    
    private int Data;
    
    /**
     * Clase base para lista de disco.
     * @param data Integer
     */
    public Disco(int data){
        this.Data=data;
    }
    
    
    
}
