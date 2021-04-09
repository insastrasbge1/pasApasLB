/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.beuvron.cours.m2.tutoVideoDessin.gui;

import fr.insa.beuvron.cours.m2.tutoVideoDessin.Groupe;
import fr.insa.beuvron.cours.m2.tutoVideoDessin.Point;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 *
 * @author francois
 */
public class Controleur {
    
    public int etat;
    
    public Groupe model;
    
    public MainDessinPaneResizable vue;

    public Controleur(int etat, Groupe model, MainDessinPaneResizable vue) {
        this.etat = etat;
        this.model = model;
        this.vue = vue;
    }

    void clicDessin(MouseEvent t) {
        if (this.etat == 30) {
            double posx = t.getX();
            double posy = t.getY();
            Point np = new Point(posx, posy, 
                    Color.BLACK);
            this.model.add(np);
            this.vue.redraw();
        }
        
    }
    
    
}
