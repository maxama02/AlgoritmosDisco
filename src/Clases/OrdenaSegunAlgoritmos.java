/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Ordenar la lista en distintos algoritmos
 *
 * @author Max Alonso Mena Arguedas
 */
public class OrdenaSegunAlgoritmos {

    ArrayList<Disco> lista;
    DatosNecesarios claseDatos;

    /**
     * Constructor
     *
     * @param a Lista dinamica a ordenar
     */
    public OrdenaSegunAlgoritmos(DatosNecesarios a) {
        claseDatos = a;
        lista = a.getTareasDisco();
    }

    /*
     First In First Out (FIFO)
     Shortest Seek First (SSF)
     Ascensor (SCAN)
     Ascensor Cíclico (C-SCAN)
     */
    /**
     * Clase FIFO no modifica nada
     *
     * @return ArrayList
     */
    public ArrayList FIFO() {
        return claseDatos.getTareasDisco();
    }

    /**
     * Clase que ordena la Lista con base en la posicion de la cabeza
     *
     * @return ArrayList
     */
    public ArrayList SSF() {
        int posicion;
        int posDer;
        int posIzq;
        boolean bandI = true, bandD = true;
        int cabeza = claseDatos.getPosicionCabeza();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> listaSSF = new ArrayList<>();
        lista2.add(cabeza);

        lista.forEach((dis) -> {
            lista2.add(dis.getData());
        });
        Collections.sort(lista2);

        posicion = lista2.indexOf(cabeza);
        posDer = posicion + 1;
        posIzq = posicion - 1;

        while (posIzq > 0 || posDer < lista2.size()) {
            if (Math.abs(cabeza - lista2.get(posDer)) <= Math.abs(cabeza - lista2.get(posIzq))) {
                if (bandD) {
                    cabeza = lista2.get(posDer);
                    listaSSF.add(lista2.get(posDer));
                }
                //posDer++;
                if (posDer != lista2.size()) {
                    posDer++;
                } else if (posDer == lista2.size()) {
                    posDer=lista2.size();
                    bandD = false;
                    listaSSF.add(lista2.get(posIzq));
                    posIzq--;
                }
            } else if (Math.abs(cabeza - lista2.get(posDer)) > Math.abs(cabeza - lista2.get(posIzq))) {

                if (bandI) {
                    cabeza = lista2.get(posIzq);
                    listaSSF.add(lista2.get(posIzq));
                }

                if (posIzq != 0) {
                    posIzq--;

                } else if (posIzq == 0) {
                    posIzq = 0;
                    bandI = false;
                    listaSSF.add(lista2.get(posDer));
                    posDer++;
                }
            }
        }

        return listaSSF;
    }
    /**
     * Acomoda la lista al estilo SCAN
     * @return ArrayList
     */
    public ArrayList SCAN(){
        int posicion;
        int posDer;
        int posIzq;
        int cabeza = claseDatos.getPosicionCabeza();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> listaSCAN = new ArrayList<>();
        lista2.add(cabeza);
        lista.forEach((dis) -> {
            lista2.add(dis.getData());
        });
        Collections.sort(lista2);

        posicion = lista2.indexOf(cabeza);
        posDer = posicion + 1;
        posIzq = posicion - 1;
        
        while(posIzq>=0){
            listaSCAN.add(lista2.get(posIzq));
            posIzq--;
        }
        while(posDer<= lista.size()){
            listaSCAN.add(lista2.get(posDer));
            posDer++;
        }
        
        return listaSCAN;
    }
    
    /**
     * Acomoda la lista al estilo CSCAN
     * @return ArrayList
     */
    public ArrayList CSCAN(){
        int posicion;
        int posDer;
        int posIzq;
        int cabeza = claseDatos.getPosicionCabeza();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> listaCSCAN = new ArrayList<>();
        lista2.add(cabeza);
        lista.forEach((dis) -> {
            lista2.add(dis.getData());
        });
        Collections.sort(lista2);

        posicion = lista2.indexOf(cabeza);
        posDer = posicion + 1;
        posIzq = posicion - 1;
        
        while(posDer<= lista.size()){
            listaCSCAN.add(lista2.get(posDer));
            posDer++;
        }
        while(posIzq>=0){
            listaCSCAN.add(lista2.get(posIzq));
            posIzq--;
        }
        
        return listaCSCAN;
    }

}
