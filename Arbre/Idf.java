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
/*
    public String toString() {
        String s = "Idf\n";
        s += "Nom : " + this.nom + "\n";
        s += this.type;
        return s;
    }
*/
    public String toString() {
        return this.nom;
    }

}
