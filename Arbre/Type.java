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

    //private static Type instance;

    //public static Type getInstance() {
    //    if (instance == null)
	//	{
    //        instance = new Type();
	//	}
	//	return instance;
    //}

    public abstract boolean estConforme(Type other);

    public String toString() {
        return "Type";
    }
}
