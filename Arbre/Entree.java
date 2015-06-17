/*
 * =====================================================================================
 *
 *       Filename:  Entree.java
 *
 *    Description:  Représentation d'une entrée.
 *                  Attention !!! Pour que HashMap fonctionne des Entrées,
 *                  il faut surcharger la méthode equals et hashCode !!!
 *
 *        Version:  1.0
 *        Created:  04/28/2015 07:24:36 PM
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

public class Entree {

    // Identificateur de l'entrée.
    private Ident ident;

    // Construire une entrée.
    public Entree(Ident ident){
        this.ident = ident;
    }

    // Identificateur attaché à l'entrée.
    public Ident ident() {
        return this.ident;
    }

    // Utilisé pour l'affichage de la table des symboles.
    public String toString() {
        return "" + this.ident;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Entree))
            return false;

        Entree e = (Entree)o;

        return e.ident().getName().equals(this.ident.getName());
    }

    public int hashCode() {
        return this.ident.getName().hashCode();
    }

}
