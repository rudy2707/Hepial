/*
 * =====================================================================================
 *
 *       Filename:  Ident.java
 *
 *    Description:  Stockage des identifiants.
 *                  Utilisé pour la table des symboles.
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

public class Ident {
    private String name;

    public Ident(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }
}
