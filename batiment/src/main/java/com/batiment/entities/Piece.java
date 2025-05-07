package com.batiment.entities;

import java.util.List;
import java.util.ArrayList;

public class Piece extends Objet3D {
    private String nom;
    private int nbMeublesMaxi;
    private List<Meuble> tabMeubles = new ArrayList<>();

    public Piece(int largeur, int hauteur, int profondeur, String nom, int nbMeublesMaxi) {
        super(largeur, hauteur, profondeur);
        this.setNom(nom);
        this.setNbMeublesMaxi(nbMeublesMaxi);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbMeublesMaxi() {
        return nbMeublesMaxi;
    }

    public void setNbMeublesMaxi(int nbMeublesMaxi) {
        if (nbMeublesMaxi < 0) {
            throw new IllegalArgumentException("nbMeublesMaxi ne peut pas être inférieur à 0.");
        }
        this.nbMeublesMaxi = nbMeublesMaxi;
    }

    public List<Meuble> getTabMeubles() {
        return tabMeubles;
    }

    public void addMeuble(Meuble meuble) {
        if (nbMeubles() == nbMeublesMaxi) {
            throw new IllegalArgumentException("Le nombre de meuble maximum a été atteint.");
        }
        if (meuble.surface() > surfaceLibre()) {
            throw new IllegalArgumentException(
                    "La surface du meuble ne peut pas être plus grande que la surface libre.");
        }
        this.tabMeubles.add(meuble);
    }

    public int nbMeubles() {
        return tabMeubles.size();
    }

    public long surfaceMeubles() {
        long surfaceMeubles = 0;
        for (Meuble meuble : tabMeubles) {
            surfaceMeubles += meuble.surface();
        }
        return surfaceMeubles;
    }

    public long surfaceLibre() {
        return this.surface() - this.surfaceMeubles();
    }

}
