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
     * @return
     */
    public ArrayList FIFO() {
        return claseDatos.getTareasDisco();
    }

    /**
     * Clase que ordena la Lista con base en la posicion de la cabeza
     *
     * @return
     */
    public ArrayList SSF() {
        int posicion;
        int posDer;
        int posIzq;
        int cabeza = claseDatos.getPosicionCabeza();
        //int val1 = Math.abs(cabeza);//encuentra el valor absoluto
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> listaSSF = new ArrayList<>();
        lista2.add(cabeza);
        for (Disco dis : lista) {
            lista2.add(dis.getData());
        }
        Collections.sort(lista2);

        posicion = lista2.indexOf(cabeza);
        posDer = posicion + 1;
        posIzq = posicion - 1;

        while (posIzq >= 0 || posDer <= lista2.size()) {
            if (Math.abs(cabeza - lista2.get(posDer)) < Math.abs(cabeza - lista2.get(posIzq))) {
                listaSSF.add(lista2.get(posDer));
                posDer++;
            } else if (Math.abs(cabeza - lista2.get(posDer)) > Math.abs(cabeza - lista2.get(posIzq))) {
                listaSSF.add(lista2.get(posIzq));
                posIzq++;
            }
        }

        /*
        necesito averiguar que pasa si la cabeza esta en x cual n esta mas cerca (cual resta es menor)
         */
        return listaSSF;
    }

}
