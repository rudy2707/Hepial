/*
 * =====================================================================================
 *
 *       Filename:  Pour.java
 *
 *    Description:  Pour
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

public class Pour extends Instruction {

	private Idf idf;
	private List<Instruction> instr;
	private Expression borneInf;
	private Expression borneSup;

	public Pour (Idf idf, List<Instruction> instr, Expression borneInf, Expression borneSup, int lig) {
		super(lig);
		this.idf = idf;
		this.instr = instr;
		this.borneInf = borneInf;
		this.borneSup = borneSup;
	}

	public Expression borneInf() {
		return this.borneInf;
	}

	public Expression borneSup() {
		return this.borneSup;
	}

	public List<Instruction> instr() {
		return this.instr;
	}

	public Idf idf() {
		return this.idf;
	}

	public String toString() {
		return ""+valeur;
	}
}
