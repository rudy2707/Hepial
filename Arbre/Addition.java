/*
 * =====================================================================================
 *
 *       Filename:  Addition.java
 *
 *    Description:  Addition
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

public class Addition extends Arithmetique {

	private Expression g;
	private Expression d;


	public Addition (Expression g, Expression d, int lig) {
		super(g, d, lig);
		this.g = g;
		this.d = d;
		System.out.println(this);
	}

	public String operateur () {
		return "+";
	}

    public Type getType() {
        return TypeEntier.getInstance();
    }

    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

    public String toString() {
    	return "Addition" + g + this.operateur() + d;
    	//return "Addition" + g;
    }

}
