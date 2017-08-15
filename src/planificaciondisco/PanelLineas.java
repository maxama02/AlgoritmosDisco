/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planificaciondisco;

import Clases.Linea;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class PanelLineas extends javax.swing.JPanel {

    /**
     * Variables para crear
     */
    private int ancho = 600, alto = 500;
    private ArrayList<Integer> lista;
    private int tamano, cabecera;
    private String nombre;

    /**
     * Constructor del Panel
     *
     * @param lista ArrayList
     * @param tamano Integer
     * @param cabecera Integer
     * @param nombre String
     */
    public PanelLineas(ArrayList lista, int tamano, int cabecera, String nombre) {
        initComponents();
        setSize(ancho, alto);

        this.lista = lista;
        this.tamano = tamano;
        this.cabecera = cabecera;
        this.nombre=nombre;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());
        Linea li = new Linea(lista, tamano, cabecera, ancho, nombre);
        li.Dibujar(g);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
