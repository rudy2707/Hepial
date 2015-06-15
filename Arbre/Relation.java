/*
 * =====================================================================================
 *
 *       Filename:  Relation.java
 *
 *    Description:  Relation
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

public abstract class Relation extends Binaire {
	
	public Relation (Expression g, Expression d, int lig) {
		super(g, d, lig);
	}
	
}
