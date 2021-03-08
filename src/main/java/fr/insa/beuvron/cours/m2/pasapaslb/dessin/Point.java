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
public class Point extends FigureSimple {

    private double px;
    private double py;

    public Point() {
        this(0.0, 0.0, Color.black);
    }

    public Point(double abs, double ord) {
        this(abs,ord,Color.black);
    }

    public Point(double abs, double ord,Color couleur) {
        super(couleur);
        this.px = abs;
        this.py = ord;
    }

    public double getPx() {
        return this.px;
    }

    public void setPx(double px) {
        this.px = px;
    }

    public double getPy() {
        return this.py;
    }

    public void setPy(double px) {
        this.px = py;
    }

    public double distance(Point p2) {
        double dx = this.px - p2.px;
        double dy = this.py - p2.py;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point milieu(Point p2) {
        Point res;
        res = new Point();
        res.px = (this.px + p2.px) / 2;
        res.py = (this.py + p2.py) / 2;
        return res;
    }

    public static void testDistance() {
        Point p1, point2, p3;
        p1 = new Point(0, 0);
        point2 = new Point(1, 1);
        double dist = p1.distance(point2);
        System.out.println("distance : " + dist);
        p3 = p1.milieu(point2);
        System.out.println("milieu : " + p3);
    }

    public String toString() {
        return "(" + this.px + "," + this.py + ")";
    }

    public static void main(String[] args) {
        testDistance();
    }

}
