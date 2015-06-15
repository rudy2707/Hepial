/*
 * =====================================================================================
 *
 *       Filename:  Entree.java
 *
 *    Description:  Représentation d'une entrée.
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

public abstract class Entree {

    // Identificateur de l'entrée.
    private Ident ident;

    // Construire une entrée.
    protected Entree(Ident ident){
        this.ident = ident;
    }

    // Identificateur attaché à l'entrée.
    public abstract Ident ident();

    // Utilisé pour l'affichage de la table des symboles.
    public String toString() {
        String s = "";
        s += this.ident;
        return s;
    }
}
