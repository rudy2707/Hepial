/*
 * =====================================================================================
 *
 *       Filename:  EntreeEntBool.java
 *
 *    Description:  Représentation d'une entrée d'entier ou boolean.
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

public class EntreeEntBool extends Entree {
    // Identificateur de l'entrée.
    private Ident ident;

    // Identificateur attaché à l'entrée.
    public EntreeEntBool(Ident ident) {
        super(ident);
        System.out.println("Constructor EntreEntBool, avec i = " + ident);
    }

    public Ident ident() {
        return this.ident;
    }

    public String toString () {

        return "EntreeEntBool " + this.ident;
    }
}
