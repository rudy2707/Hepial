/*
 * =====================================================================================
 *
 *       Filename:  Nombre.java
 *
 *    Description:  Nombre
 *
 *        Version:  1.0
 *        Created:  05/05/2015 07:24:36 PM
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

public class Nombre extends Expression {

	protected int valeur;
    protected Type type;
    // Position dans la pile pour la génération du Bytecode.
    protected int valeurPile;


	public Nombre (Integer val, int lig) {
		super(lig);
		this.valeur = val.intValue();
	}	// Nombre

	// Valeur de l'expression
	public int valeur() {
		return valeur;
	}

    public Type getType() {
        return TypeEntier.getInstance();
    }

    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

    public String toString() {
	return String.valueOf(this.valeur);
    }

    public void setPile(int val) {
        this.valeurPile = val;
    }

    public int getPile() {
        return this.valeurPile;
    }
}
