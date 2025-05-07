package com.batiment.entities;

import java.util.ArrayList;
import java.util.List;

public class Batiment {
    private String adresse;
    private int nombrePiecesMax;
    private List<Piece> tabPieces = new ArrayList<>();

    public Batiment(String adresse, int nombrePiecesMax) {
        this.setAdresse(adresse);
        this.setNombrePiecesMax(nombrePiecesMax);
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNombrePiecesMax() {
        return nombrePiecesMax;
    }

    public void setNombrePiecesMax(int nombrePiecesMax) {
        if (nombrePiecesMax < 0) {
            throw new IllegalArgumentException("nombrePiecesMax ne peut pas être inférieur à 0.");
        }
        this.nombrePiecesMax = nombrePiecesMax;
    }

    public List<Piece> getTabPieces() {
        return tabPieces;
    }

    public void addPiece(Piece piece) {
        if (nbPieces() == nombrePiecesMax) {
            throw new IllegalArgumentException("Le nombre de piece maximal a été atteint.");
        }
        this.tabPieces.add(piece);
    }

    public int nbPieces() {
        return tabPieces.size();
    }

    public int piecesLibres() {
        return this.nombrePiecesMax - this.nbPieces();
    }
}
