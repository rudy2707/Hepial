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

import java.util.*;

public abstract class Entree {

    // Identificateur de l'entrée.
    private Ident ident;

    // Construire une entrée.
    public Entree(Ident ident){
        System.out.println("Constructeur Entree, avec i = " + ident);
        this.ident = ident;
    }

    // Identificateur attaché à l'entrée.
    public abstract Ident ident();

    // Utilisé pour l'affichage de la table des symboles.
    public String toString() {
        //String s = "";
        //s += this.ident;
        //return s
        //;
        return "" + this.ident;
    }
}
