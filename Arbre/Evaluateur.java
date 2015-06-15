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
        Object valG = a.gauche().accepter(this);
        if (valG == null)
            return null;
        // Check la valeur droite.
        Object valD = a.gauche().accepter(this);
        if (valD == null)
            return null;
        int g = ((Integer)valG).intValue();
        int d = ((Integer)valD).intValue();
        return new Integer(g - d);
    }

    // Multiplication
    public Object visiter(Produit p) {
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
        return new Integer(g * d);
    }

    // Division
    public Object visiter(Division d);
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
        return new Integer(g / d);

    // Comparaison
    public Object visiter(Egal e);
    public Object visiter(Inferieur e);
    public Object visiter(InfEgal e);
    public Object visiter(Superieur e);
    public Object visiter(SupEgal e);
    public Object visiter(Different e);

    public Object visiter(Affectation a);



    // TODO : Condition, Pour, Appel de fonction, Bloc, ...

}
