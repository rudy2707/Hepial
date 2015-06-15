/*
 * =====================================================================================
 *
 *       Filename:  Appel.java
 *
 *    Description:  Appel
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

public abstract class Appel extends Instruction {

   	private Idf idf;
   	private ParametresEffectifs parametres;
   	
   	public Appel(Idf idf, ParametresEffectifs parametres, int lig) {
   		super(lig);
   		this.parametres = parametres;
   		this.idf = idf;
   	}
}
