/*
 * =====================================================================================
 *
 *       Filename:  Type.java
 *
 *    Description:  Type booleen.
 *                  Renvoi un singleton. Permet de savoir si un type est un boolean
 *                  en comparant l'instance du type avec celle-ci.
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

public class TypeBooleen extends Type {

    // Singleton.
    private static TypeBooleen instance;

    /**
     *  Retourne une instance de TypeBooleen. C'est un singleton.
     *  S'il n'existe pas, il est créé.
     */
    public static TypeBooleen getInstance() {
        if (instance == null)
		{
            instance = new TypeBooleen();
		}
		return instance;
    }

    public boolean estConforme(Type other) {
        return other instanceof TypeEntier;
    }

    public String toString() {
        return "Type Booleen";
    }
}
