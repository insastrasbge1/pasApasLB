/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.beuvron.cours.m2.tutoVideoDessin;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author francois
 */
public class Segment extends FigureSimple {

    private Point debut;
    private Point fin;

    public Segment(Point debut, Point fin, Color couleur) {
        super(couleur);
        this.debut = debut;
        this.fin = fin;
    }

    public Segment(Point debut, Point fin) {
        this(debut, fin, Color.BLUE);
    }

    public Point getDebut() {
        return debut;
    }

    public Point getFin() {
        return fin;
    }

    @Override
    public String toString() {
        return "[" + this.debut + "," + this.fin + ']';
    }

    public static Segment demandeSegment() {
        System.out.println("point début : ");
        Point deb = Point.demandePoint();
        System.out.println("point fin : ");
        Point fin = Point.demandePoint();
        return new Segment(deb, fin);
    }

    @Override
    public double maxX() {
        return Math.max(this.debut.maxX(), this.fin.maxX());
    }

    @Override
    public double minX() {
        return Math.min(this.debut.minX(), this.fin.minX());
    }

    @Override
    public double maxY() {
        return Math.max(this.debut.maxY(), this.fin.maxY());
    }

    @Override
    public double minY() {
        return Math.min(this.debut.minY(), this.fin.minY());
    }

    @Override
    public double distancePoint(Point p) {
        double x1 = this.debut.getPx();
        double y1 = this.debut.getPy();
        double x2 = this.fin.getPx();
        double y2 = this.fin.getPy();
        double x3 = p.getPx();
        double y3 = p.getPy();
        double up = ((x3 - x1) * (x2 - x1) + (y3 - y1) * (y2 - y1))
                / (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if (up < 0) {
            return this.debut.distancePoint(p);
        } else if (up > 1) {
            return this.fin.distancePoint(p);
        } else {
            Point p4 = new Point(x1 + up * (x2 - x1),
                    y1 + up * (y2 - y1));
            return p4.distancePoint(p);
        }
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setStroke(this.getCouleur());
        gc.strokeLine(this.debut.getPx(), this.debut.getPy(), 
                this.fin.getPx(), this.fin.getPy());
    }
    
}
