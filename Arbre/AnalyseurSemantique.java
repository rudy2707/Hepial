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
        arbre.accepter(this);
    }

    // Méthodes visiter() des différents éléments.
    // Opérations
    public Object visiter(Addition a) {
        // Vérifie les types de l'addition.
        a.gauche().accepter(this);
        if (!a.gauche().getType().estConforme(TypeEntier.getInstance())) {
            // TODO : Error
        }

        a.droit().accepter(this);
        if (!a.droit().getType().estConforme(TypeEntier.getInstance())) {
            // TODO : Error
        }
        return null;
    }

    public Object visiter(Soustraction s) {
        // Vérifie les types de la soustraction.
        s.gauche().accepter(this);
        if (!s.gauche().getType().estConforme(TypeEntier.getInstance())) {
            // TODO : Error
        }

        s.droit().accepter(this);
        if (!s.droit().getType().estConforme(TypeEntier.getInstance())) {
            // TODO : Error
        }
        return null;
    }

    public Object visiter(Produit p) {
        return null;
    }

    public Object visiter(Division d) {
        return null;
    }

    // Comparaison
    public Object visiter(Egal e) {
        return null;
    }

    public Object visiter(Inferieur e) {
        return null;
    }

    public Object visiter(InfEgal e) {
        return null;
    }

    public Object visiter(Superieur e) {
        return null;
    }

    public Object visiter(SupEgal e) {
        return null;
    }

    public Object visiter(Different e) {
        return null;
    }

    public Object visiter(Affectation a) {
        a.dest().accepter(this);    // Vérifie si l'identifiant destination est correct.
        Type typeDest = a.dest().getType();
        //a.source().accepter(this);  // Vérifie si l'expression source est correct.
        //Type tg = a.source().getType();
        Object v = a.source().accepter(Evaluateur.getInstance());

        if (v != null)
            a.setSource(new Nombre((Integer)v, 1));

        a.source().accepter(this);
        Type typeSource = a.source().getType();
        if (!(typeSource.estConforme(typeDest))) {
            // Erreur
        }
        else {
            //a.setType(typeDest);
        }
        return null;

        //if (!tg.estConforme(td)) {
        //    // TODO : Générer une erreur, idéalement avec la ligne.
        //    // Pour la ligne, il faut la passer depuis le flex.
        //    // Faire une classe pour stocker les messages d'erreur ???
        //}
    }


    public Object visiter(Idf i) {
        return null;
    }

    public Object visiter(Ident i) {
        return null;
    }

    public Object visiter(Nombre n) {
        return null;
    }

    public Object visiter(Condition c) {
        return null;
    }

    // TODO : Condition, Pour, Appel de fonction, Bloc, ...

}
