/*
 * =====================================================================================
 *
 *       Filename:  Type.java
 *
 *    Description:  Type d'une variable.
 *
 *        Version:  1.0
 *        Created:  04/28/2015 07:24:36 PM
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

public abstract class Type {

    public abstract boolean estConforme(Type other);

    public String toString() {
        return "Type";
    }
}
