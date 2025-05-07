package com.batiment.entities;

public class Objet3D {
    private int largeur;
    private int hauteur;
    private int profondeur;

    public Objet3D(int largeur, int hauteur, int profondeur) {
        this.setLargeur(largeur);
        this.setHauteur(hauteur);
        this.setProfondeur(profondeur);
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        if (largeur <= 0) {
            throw new IllegalArgumentException("La largeur ne peut pas être inférieure ou égale à 0.");
        }
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        if (hauteur <= 0) {
            throw new IllegalArgumentException("La hauteur ne peut pas être inférieure ou égale à 0.");
        }
        this.hauteur = hauteur;
    }

    public int getProfondeur() {
        return profondeur;
    }

    public void setProfondeur(int profondeur) {
        if (profondeur <= 0) {
            throw new IllegalArgumentException("La profondeur ne peut pas être inférieure ou égale à 0");
        }
        this.profondeur = profondeur;
    }

    public long volume() {
        return largeur * hauteur * profondeur;
    }

    public long surface() {
        return largeur * profondeur;
    }
}
