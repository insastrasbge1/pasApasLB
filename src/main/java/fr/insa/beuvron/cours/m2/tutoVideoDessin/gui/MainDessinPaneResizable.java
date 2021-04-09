/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.beuvron.cours.m2.tutoVideoDessin.gui;

import fr.insa.beuvron.cours.m2.tutoVideoDessin.Groupe;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 *
 * @author francois
 */
public class MainDessinPaneResizable extends BorderPane {
    
    private Groupe model;
    
    private Controleur control;

    private RadioButton tbSelect;
    private RadioButton tbPoint;
    private RadioButton tbSegment;

    private Button bGroupe;
    private Button bCouleur;

    private DessinCanvasResizable zoneDessin;

    public MainDessinPaneResizable() {
        this(new Groupe());
    }

    public MainDessinPaneResizable(Groupe model) {
        this.model = model;
        this.control = new Controleur(30, this.model, this);
        ToggleGroup tgState = new ToggleGroup() ;
        this.tbSelect = new RadioButton("Select");
        this.tbSelect.setToggleGroup(tgState);
//        this.tbSelect.setOnAction((t) -> { control.boutonSelect(t);
//        });
        this.tbPoint = new RadioButton("Point");
        this.tbPoint.setToggleGroup(tgState);
//        this.tbPoint.setOnAction((t) -> { control.boutonPoint(t);
//        });
        this.tbSegment = new RadioButton("Segment");
        this.tbSegment.setToggleGroup(tgState);
//        this.tbSegment.setOnAction((t) -> { control.boutonSegment(t);
//        });
        this.tbPoint.setSelected(true);

        VBox vbLeft = new VBox(this.tbSelect, this.tbPoint, this.tbSegment);
        this.setLeft(vbLeft);

        this.bGroupe = new Button("Groupe");
        this.bGroupe.setDisable(true);
        this.bCouleur = new Button("Couleur");
        this.bCouleur.setDisable(true);
        VBox vbRight = new VBox(this.bGroupe, this.bCouleur);
        this.setRight(vbRight);

        this.zoneDessin = new DessinCanvasResizable(this,this.model,300,200);
        this.setCenter(this.zoneDessin);

    }

    public Controleur getControl() {
        return control;
    }

    
    public Groupe getModel() {
        return model;
    }

    public Button getbGroupe() {
        return bGroupe;
    }

    public Button getbCouleur() {
        return bCouleur;
    }

    public Color curColor() {
        // TODO
        return Color.color(Math.random(), Math.random(), Math.random());
    }

    void redraw() {
        this.zoneDessin.redraw();
    }


    
}
