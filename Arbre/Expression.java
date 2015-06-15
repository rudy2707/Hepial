/*
 * =====================================================================================
 *
 *       Filename:  Expression.java
 *
 *    Description:  Expression
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

public abstract class Expression implements ArbreAbstrait {

   	private int lig;

   	public Expression(int lig) {
   		this.lig = lig;
   	}

    // On doit pouvoir accéder au type de chaque expression.
    public abstract Type getType();

    public String toString() {
    	return "Expression";
    }
}
