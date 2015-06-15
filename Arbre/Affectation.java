/*
 * =====================================================================================
 *
 *       Filename:  Affectation.java
 *
 *    Description:  Affectation
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

public class Affectation extends Instruction {

	private Expression source;
	private Idf dest;
    private Type type;

	public Affectation(Idf dest, Expression source, int lig) {
		super(lig);
		this.dest = dest;
		this.source = source;
	}

	public Expression source() {
		return this.source;
	}

	public Expression dest() {
		return this.dest;
	}

    public void setSource(Expression s) {
        this.source = s;
    }

    public void setType(Type t) {
        this.type = t;
    }

    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

    public String toString() {
    	return "Affectation : " + dest + " = " + source;
    }

}
