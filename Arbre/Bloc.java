/*
 * =====================================================================================
 *
 *       Filename:  Bloc.java
 *
 *    Description:  Bloc
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

public class Bloc extends Instruction {
		
	private List<Instruction> instr;
		
	public Bloc (List<Instruction> instr, int lig) {
		super(lig);
		this.instr = instr;
	}	// Bloc
	
	public List<Instruction> instr() {
		return this.instr;
	}	
	
	public String toString() {
		return ""+valeur;
	}
}
