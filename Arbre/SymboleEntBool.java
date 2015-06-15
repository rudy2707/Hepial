/*
 * =====================================================================================
 *
 *       Filename:  SymboleEntBool.java
 *
 *    Description:  Symbole contenant un entier ou un boolean.
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

public class SymboleEntBool extends Symbole {
    // Ligne d'un symbole.
    private int ligne;
    // Type du symbole.
    private Type type;

    // Construire un Symbole.
    public SymboleEntBool(int ligne, Type type) {
        super(ligne);
        this.type = type;
    }

    // Retourne la ligne dans le texte.
    public int ligne() {
        return this.ligne;
    }

    public String toString() {
        if (type instanceof TypeEntier)
            return "Entier";
        else if (type instanceof TypeBooleen)
            return "Booleen";
        else
            return "SymboleEntBool";
    }

    public Type getType() {
        return this.type;
    }
}
