/*
 * =====================================================================================
 *
 *       Filename:  Lire.java
 *
 *    Description:  Lire
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

public class Lire extends Instruction {
    private Idf i;

    public Lire(Integer ligne) {
        super(ligne);
    }

    public Idf getIdf() {
        return this.i;
    }

    public void setIdf(Idf id) {
        this.i = id
    }

    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }
}
