/*
 * =====================================================================================
 *
 *       Filename:  Idf.java
 *
 *    Description:  Idf utilisé pour l'arbre abstrait.
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

public class Idf extends Expression {
	protected String nom;
	protected Type type;
    // Position dans la pile pour la génération du Bytecode.
    protected int valeurPile;


	public Idf(String nom, int lig) {
        super(lig);
		this.nom = nom;
        this.valeurPile = -1;
	}

    public Type getType() {
        return this.type;
    }

    public void setType(Type t) {
        this.type = t;
    }

    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

    public String getName() {
        return this.nom;
    }

    public String toString() {
        return this.nom;
    }

    public void setPile(int val) {
        this.valeurPile = val;
    }

    public int getPile() {
        return this.valeurPile;
    }

}
