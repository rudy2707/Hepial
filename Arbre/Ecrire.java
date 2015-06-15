/*
 * =====================================================================================
 *
 *       Filename:  Ecrire.java
 *
 *    Description:  Ecrire
 *
 *        Version:  1.0
 *        Created:  15/06/2015 07:24:36 PM
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

public class Ecrire extends Instruction {
    private Expression texte;

    public Ecrire(Integer ligne) {
        super(ligne);
    }

    public Expression getTexte() {
        return this.texte;
    }

    public void setTexte(Expression t) {
        this.texte = t;
    }

    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }
}
