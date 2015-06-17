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

    // Identificateur attaché à l'entrée.
    public EntreeEntBool(Ident ident) {
        super(ident);
    }

    public Ident ident() {
        return super.ident();
    }

    public String toString () {
        return "EntreeEntBool : " + super.ident();
    }
}
