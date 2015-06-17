/*
 * =====================================================================================
 *
 *       Filename:  Idf.java
 *
 *    Description:  Idf
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

	public Idf(String nom, int lig) {
        super(lig);
		this.nom = nom;
        //System.out.println("symb idf avant");
        ////System.out.println(TDS.getInstance().getSymbole(new EntreeEntBool(new Ident(nom))).getType());
        //EntreeEntBool e = new EntreeEntBool(new Ident(nom));
        //System.out.println("SYMBOLE idf avant");
        //System.out.println("Entree : " + e);
        //this.type = TDS.getInstance().getSymbole(new EntreeEntBool(new Ident(nom))).getType();
        //System.out.println("symb idf apres");
	}

    public Type getType() {
        System.out.println("IDF Type : " + this.type);
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

}
