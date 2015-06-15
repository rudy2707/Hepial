/*
 * =====================================================================================
 *
 *       Filename:  Symbole.java
 *
 *    Description:  Représentation d'un symbole.
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

public abstract class Symbole {
    // Ligne d'un symbole.
    private int ligne;

    // Construire un Symbole.
    protected Symbole(int ligne) {
        this.ligne = ligne;
    }

    // Ligne dans le texte.
    public abstract int ligne();

}
