/*
 * =====================================================================================
 *
 *       Filename:  Condition.java
 *
 *    Description:  Condition
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

public class Condition extends Instruction {
	/*
	private List<Instruction> alors;
	private List<Instruction> sinon;
	*/
	private String alors;
	private String sinon;
	private Expression condition;

	//public Condition (List<Instruction> alors, List<Instruction> sinon, Expression condition, int lig) {
	public Condition (String alors, String sinon, Expression condition, int lig) {
		super(lig);
		this.alors = alors;
		this.sinon = sinon;
		this.condition = condition;
		System.out.println("Condition");
	}

	public Expression condition() {
		return this.condition;
	}

	/*
	public List<Instruction> alors() {
		return this.alors;
	}

	public List<Instruction> sinon() {
		return this.sinon;
	}
	*/
	public String alors() {
		return this.alors;
	}

	public String sinon() {
		return this.sinon;
	}

    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

	public String toString() {
		return "Condition : " + this.condition + " alors : " + this.alors + "\nsinon : " + this.sinon;
	}
}
