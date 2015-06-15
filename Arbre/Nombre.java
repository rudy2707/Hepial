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
/*
    public String toString() {
        String s = "Nombre\n";
        s += "Valeur : " + this.valeur + "\n";
        s += this.type;
        return s;
    }
    */

    public String toString() {
        String s = new String(); 
        s += "" + this.valeur;
        return s;
    }
}
