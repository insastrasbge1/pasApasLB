/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.beuvron.cours.m2.tutoVideoDessin;

import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author francois
 */
public abstract class Figure {

    /**
     * null si aucun groupe
     */
    private Groupe groupe;

    public Groupe getGroupe() {
        return groupe;
    }

    void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }
    
    public abstract double maxX();
    public abstract double minX();
    public abstract double maxY();
    public abstract double minY();
    
    public abstract double distancePoint(Point p);
    
    public abstract void draw(GraphicsContext gc);
    
}
