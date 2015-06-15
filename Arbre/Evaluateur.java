/*
 * =====================================================================================
 *
 *       Filename:  Evaluateur.java
 *
 *    Description:  Implémente l'interface visiteur.
 *                  C'est cette classe qui évalue les variables.
 *                  Elle remplace les variables par leur valeur.
 *                  On effectue l'opération.
 *                  Si on a une addition, on renvoit la valeur de l'addition.
 *                  C'est aussi un singleton.
 *
 *        Version:  1.0
 *        Created:  05/06/2015 09:03:36 PM
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

public class Evaluateur implements Visiteur {

    private static Evaluateur instance;

    public Evaluateur() { }

    public static Evaluateur getInstance() {
        if (instance == null) {
            instance = new Evaluateur();
        }
        return instance;
    }

    // Méthodes visiter() des différents éléments.
    //
    // Nombre
    public Object visiter(Nombre n) {
        return new Integer(n.valeur());
    }

    // Identifiant
    public Object visiter(Idf i) {
        return null;
    }

    // Opérations
    //
    // Addition
    public Object visiter(Addition a) {
        // Check la valeur gauche.
        Object valG = a.gauche().accepter(this);
        if (valG == null)
            return null;
        // Check la valeur droite.
        Object valD = a.gauche().accepter(this);
        if (valD == null)
            return null;
        int g = ((Integer)valG).intValue();
        int d = ((Integer)valD).intValue();
        return new Integer(g + d);
    }

    // Soustraction
    public Object visiter(Soustraction s) {
        // Check la valeur gauche.
        Object valG = s.gauche().accepter(this);
        if (valG == null)
            return null;
        // Check la valeur droite.
        Object valD = s.gauche().accepter(this);
        if (valD == null)
            return null;
        int g = ((Integer)valG).intValue();
        int d = ((Integer)valD).intValue();
        return new Integer(g - d);
    }

    // Multiplication
    public Object visiter(Produit p) {
        // Check la valeur gauche.
        Object valG = p.gauche().accepter(this);
        if (valG == null)
            return null;
        // Check la valeur droite.
        Object valD = p.gauche().accepter(this);
        if (valD == null)
            return null;
        int g = ((Integer)valG).intValue();
        int d = ((Integer)valD).intValue();
        return new Integer(g * d);
    }

    // Division
    public Object visiter(Division div) {
        // Check la valeur gauche.
        Object valG = div.gauche().accepter(this);
        if (valG == null)
            return null;
        // Check la valeur droite.
        Object valD = div.gauche().accepter(this);
        if (valD == null)
            return null;
        int g = ((Integer)valG).intValue();
        int d = ((Integer)valD).intValue();
        return new Integer(g / d);
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
        return null;
    }

    public Object visiter(Condition c) {
        return null;
    }

    public Object visiter(Ident i) {
        return null;
    }



    // TODO : Condition, Pour, Appel de fonction, Bloc, ...

}
