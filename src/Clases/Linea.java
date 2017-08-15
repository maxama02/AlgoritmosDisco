/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.abs;
import java.util.ArrayList;

/**
 *
 * @author Max Alonso Mena Arguedas.
 */
public class Linea {
    /**
     * Declaracion de variable
     */
    private ArrayList <Integer> puntos;
    private int tamano, cabecera, separacion,lineaNum, ajustador,aumen,movimiento;
    private String titulo;
    
    /**
     * Constructor de la imagen 
     * @param puntos Lista con solicitudes a disco
     * @param tamano Tamano del disco Duro
     * @param cabecera Desde donde comienza
     * @param ancho Tamano del area de dibujo
     * @param nombre String con el titulo del algoritmo
     */
    public Linea(ArrayList puntos, int tamano, int cabecera, int ancho, String nombre){
        this.puntos=puntos;
        this.tamano=tamano;
        this.cabecera=cabecera;
        separacion=5;
        lineaNum=100;
        ajustador=ancho/tamano;
        aumen=10;
        this.titulo=nombre;
    }
   
    /**
     * Dibujar es el algorit
     * @param g elemento grafico
     */
    public void Dibujar(Graphics g){
        g.setColor(Color.white);
        int pAnt=cabecera;
        int anter=pAnt*ajustador;
        int linea;
        for (int pt:puntos){
            linea=pt*ajustador;
            g.drawLine(anter, separacion, linea, separacion+aumen);
            separacion+=aumen;
            g.drawString("*", linea, separacion+5);
            g.drawString(pt+"", linea, lineaNum);
            movimiento+=abs(anter-linea)/ajustador;
            anter=linea;
        }
        
        g.drawString(titulo, lineaNum, lineaNum+lineaNum);
        g.drawString("Movimientos: "+movimiento, lineaNum+(lineaNum/2), lineaNum+lineaNum);
    }
    
}
