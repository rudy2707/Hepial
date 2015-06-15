/*
 * =====================================================================================
 *
 *       Filename:  Inferieur.java
 *
 *    Description:  Inferieur
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

public class Inferieur extends Relation {

	public Inferieur (Expression g, Expression d, int lig) {
		super(g, d, lig);
	}

	public String operateur () {
		return "<";
	}

    public Type getType() {
        return TypeBooleen.getInstance();
    }

    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

}
