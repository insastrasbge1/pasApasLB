/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.beuvron.cours.m2.pasapaslb.dessin;

import java.awt.Color;

/**
 *
 * @author francois
 */
public class Segment extends FigureSimple {
    
    private Point debut;
    private Point fin;
    
    public Segment(Point debut,Point fin) {
        super(new Color(255, 0, 255));
        this.debut = debut;
        this.fin = fin;
    }
    
    public Segment(Point debut,Point fin,Color couleur) {
        super(couleur);
        this.debut = debut;
        this.fin = fin;
    }
    
     /**
     * @return the debut
     */
    public Point getDebut() {
        return debut;
    }

    /**
     * @return the fin
     */
    public Point getFin() {
        return fin;
    }
     
    
    public String toString() {
        return "[" + this.debut +
                " , " + this.fin + "]" ;
        
    }
    
    public double longueur() {
        return this.debut.distance(this.fin);
    }
    
    public static void main(String[] args) {
        System.out.println("je suis dans segment 2");
        Segment s1 ;
        Point f;
        f = new Point(5,6);
        
        //..
        double ab = f.getPx();
        f.setPx(12);
        s1 = new Segment(new Point(3,4),f);
        System.out.println("s1 = " + s1);
    }

      
}
