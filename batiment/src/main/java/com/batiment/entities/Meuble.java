package com.batiment.entities;

public class Meuble extends Objet3D {
    private String nom;

    public Meuble(int largeur, int hauteur, int profondeur, String nom) {
        super(largeur, hauteur, profondeur);
        this.setNom(nom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void affiche() {
        // print infos
        System.out.println("nom : " + this.nom + ", volume : " + this.volume() + ", surface : " + this.surface());
    }
}
