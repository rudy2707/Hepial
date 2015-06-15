/*
 * =====================================================================================
 *
 *       Filename:  AppelQualifie.java
 *
 *    Description:  AppelQualifie
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

public class AppelQualifie extends Appel {

		Expression expr;
   	
   	public AppelQualifie(Expression expr, Idf idf, ParametresEffectifs parametres, int lig) {
   		super(idf, parametres, lig);
   		this.expr = expr;   	
   	}
}
