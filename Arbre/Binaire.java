/*
 * =====================================================================================
 *
 *       Filename:  Binaire.java
 *
 *    Description:  Binaire
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

public abstract class Binaire extends Expression {

	protected Expression operandeGauche;
	protected Expression operandeDroit;

	public Binaire(Expression g, Expression d, int lig) {
		super(lig);
		operandeGauche = g;
		operandeDroit = d;
	}

	public Expression gauche() {
		return operandeGauche;
	}

	public Expression droit() {
		return operandeDroit;
	}

	public void setGauche (Expression exp) {
		operandeGauche = exp;
	}

	public void setDroit (Expression exp) {
		operandeDroit = exp;
	}

	public String toString () {
		return "(" + operandeGauche + operateur() + operandeDroit + ")";
	}

	public abstract String operateur();
}
