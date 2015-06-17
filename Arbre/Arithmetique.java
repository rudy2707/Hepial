/*
 * =====================================================================================
 *
 *       Filename:  Arithmetique.java
 *
 *    Description:  Arithmetique
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

public abstract class Arithmetique extends Binaire {

	public Arithmetique (Expression g, Expression d, int lig) {
		super(g, d, lig);
	}

	public String toString() {
		return "Arithmetique";
	}

}
