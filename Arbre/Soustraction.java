/*
 * =====================================================================================
 *
 *       Filename:  Soustraction.java
 *
 *    Description:  Soustraction
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

public class Soustraction extends Arithmetique {

	public Soustraction (Expression g, Expression d, int lig) {
		super(g, d, lig);
	}

	public String operateur () {
		return "-";
	}

    public Type getType() {
        return TypeEntier.getInstance();
    }

	public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

    public String toString() {
    	//return "Soustraction : " + g + this.operateur() + d;
    	return "Soustraction";
    }

}
