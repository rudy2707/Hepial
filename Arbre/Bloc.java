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

	public Bloc (int lig) {
		super(lig);
		this.instr = new ArrayList<Instruction>();
	}

	public Bloc (Instruction instr, int lig) {
		super(lig);
		this.instr.add(instr);
	}	// Bloc
	
	public List<Instruction> instr() {
		return this.instr;
	}	

	public void add(Instruction i) {
		this.instr.add(i);
		System.out.println("Ajout dans le bloc \n" + this);
	}

    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

	public String toString() {
		return "Bloc : " + this.instr;
	}
}
