/*
 * =====================================================================================
 *
 *       Filename:  AnalyseurSemantique.java
 *
 *    Description:  Implémente l'interface visiteur.
 *                  C'est cette classe qui implémente les contrôles sémantiques.
*                   (Vérifie les types, ...)
*                   Cette classe est également un singleton.
 *
 *        Version:  1.0
 *        Created:  04/06/2015 10:03:36 PM
 *       Revision:  none
 *       Compiler:  javac
 *
 *         Author:  Axel Fahy (), axel.fahy@etu.hesge.ch
 *   Organization:  HES-SO hepia section ITI
 *
 * =====================================================================================
 */

package Arbre;

import java.util.*;

public class AnalyseurSemantique implements Visiteur {
    // Singleton
    private static AnalyseurSemantique instance = null;;

    public AnalyseurSemantique() {

    }

    public static AnalyseurSemantique getInstance() {
        if (instance == null)
        {
            instance = new AnalyseurSemantique();
        }
        return instance;
    }

    public void analyse(ArbreAbstrait arbre) {
        arbre.accept(this);
    }

    // Méthodes visiter() des différents éléments.
    // Opérations
    public Object visiter(Addition a) {
        // Vérifie les types de l'addition.
        a.gauche().accept(this);
        if (!a.gauche().getType().estConforme(TypeEntier.getInstance())) {
            // TODO : Error
        }

        a.droit().accept(this);
        if (!a.droit().getType().estConforme(TypeEntier.getInstance())) {
            // TODO : Error
        }
        return null;
    }

    public Object visiter(Soustraction s) {
        // Vérifie les types de la soustraction.
        s.gauche().accept(this);
        if (!s.gauche().getType().estConforme(TypeEntier.getInstance())) {
            // TODO : Error
        }

        s.droit().accept(this);
        if (!s.droit().getType().estConforme(TypeEntier.getInstance())) {
            // TODO : Error
        }
    }
    //public Object visiter(Produit p);
    //public Object visiter(Division d);

    // Comparaison
    //public Object visiter(Egal e);
    //public Object visiter(Inferieur e);
    //public Object visiter(InfEgal e);
    //public Object visiter(Superieur e);
    //public Object visiter(SupEgal e);
    //public Object visiter(Different e);

    public Object visiter(Affectation a) {
        a.source().accept(this);  // Vérifie si l'expression source est correct.
        Type tg = a.source().getType();
        a.dest().accept(this);    // Vérifie si l'identifiant destination est correct.
        Type td = a.dest().getType();

        if (!tg.estConforme(td)) {
            // TODO : Générer une erreur, idéalement avec la ligne.
            // Pour la ligne, il faut la passer depuis le flex.
            // Faire une classe pour stocker les messages d'erreur ???
        }
    }


    public Object visiter(Idf i) {


    }

    public Object visiter(Ident i) {
    }

    public Object visiter(Nombre n) {

    }
    // TODO : Condition, Pour, Appel de fonction, Bloc, ...

}
