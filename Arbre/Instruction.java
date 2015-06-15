/*
 * =====================================================================================
 *
 *       Filename:  Instruction.java
 *
 *    Description:  Instruction
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

public abstract class Instruction implements ArbreAbstrait {

   	private int lig;

   	public Instruction(int lig) {
   		this.lig = lig;
   	}
}
