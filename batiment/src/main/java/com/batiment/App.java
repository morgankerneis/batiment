package com.batiment;

import com.batiment.entities.Batiment;
import com.batiment.entities.Meuble;
import com.batiment.entities.Piece;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Batiment maison = new Batiment("5 Runglas 29400 St-Servais", 9);
        // Pour bien prendre en compte la composition stricte, les pièces n'ont pas à
        // exister
        // dans le programme principal.
        // Tu peux faire
        // maison.addPiece(new Piece(3, 2, 4, "cuisine", 3))
        // C'est vrai que ça complique un peu pour remplir les pièces mais ca correspond
        // mieux à la composition
        // Tu peux également faire :
        // public void ajouterPiece(double l, double L, double h, String nom) {
        // this.pieces.add(new Piece(l, L, h, nom));
        // }
        // Sinon, tes entités sont "nickel" !
        // ✅ checked

        Piece cuisine = new Piece(3, 2, 4, "cuisine", 3);
        Piece toiletes = new Piece(1, 2, 2, "toiletes", 1);
        Piece salleDeBain = new Piece(2, 2, 4, "salle de bain", 2);
        Piece salon = new Piece(4, 2, 6, "salon", 5);
        Piece salleDeJeux = new Piece(4, 2, 4, "salle de jeux", 5);
        Piece chambre1 = new Piece(3, 2, 3, "chambre1", 3);
        Piece chambre2 = new Piece(3, 2, 2, "chambre2", 3);
        Piece chambre3 = new Piece(3, 2, 3, "chambre3", 3);

        Meuble table = new Meuble(2, 1, 1, "table");
        Meuble chaise = new Meuble(1, 1, 1, "chaise");
        Meuble wc = new Meuble(1, 1, 1, "wc");
        Meuble baignoire = new Meuble(2, 1, 1, "baignoire");
        Meuble lit = new Meuble(2, 1, 2, "lit");
        Meuble bureau = new Meuble(2, 1, 1, "bureau");

        cuisine.addMeuble(table);
        cuisine.addMeuble(chaise);
        cuisine.addMeuble(chaise);
        toiletes.addMeuble(wc);
        salleDeBain.addMeuble(baignoire);
        salleDeBain.addMeuble(table);
        salon.addMeuble(table);
        salon.addMeuble(chaise);
        salon.addMeuble(chaise);
        salon.addMeuble(chaise);
        salon.addMeuble(chaise);
        salleDeJeux.addMeuble(table);
        salleDeJeux.addMeuble(chaise);
        salleDeJeux.addMeuble(chaise);
        salleDeJeux.addMeuble(chaise);
        salleDeJeux.addMeuble(chaise);
        chambre1.addMeuble(lit);
        chambre1.addMeuble(bureau);
        chambre1.addMeuble(chaise);
        chambre2.addMeuble(lit);
        chambre2.addMeuble(bureau);
        chambre3.addMeuble(lit);
        chambre3.addMeuble(bureau);

        maison.addPiece(cuisine);
        maison.addPiece(toiletes);
        maison.addPiece(salleDeBain);
        maison.addPiece(salon);
        maison.addPiece(salleDeJeux);
        maison.addPiece(chambre1);
        maison.addPiece(chambre2);
        maison.addPiece(chambre3);

        System.out.println("Adresse du batiment : " + maison.getAdresse());
        System.out.println("Nombre de pieces max : " + maison.getNombrePiecesMax());
        for (Piece piece : maison.getTabPieces()) {
            System.out.println(piece.getNom() + ", " + piece.nbMeubles() + " meubles :");
            for (Meuble meuble : piece.getTabMeubles()) {
                System.out.println(meuble.getNom());
            }
            System.out.println("-------------------");
        }

    }
}
