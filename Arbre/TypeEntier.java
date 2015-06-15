/*
 * =====================================================================================
 *
 *       Filename:  Type.java
 *
 *    Description:  Type entier.
 *                  Renvoi un singleton. Permet de savoir si un type est un entier
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

public class TypeEntier extends Type {

    // Singleton.
    private static TypeEntier instance;

    /**
     *  Retourne une instance de TypeEntier. C'est un singleton.
     *  S'il n'existe pas, il est créé.
     */
    public static TypeEntier getInstance() {
        if (instance == null)
		{
            instance = new TypeEntier();
		}
		return instance;
    }

    // Vérifie si le type est comforme.
    public boolean estConforme(Type other) {
        System.out.println("estconforme entier");
        return other instanceof TypeEntier;
    }

    public String toString() {
        return "Type Entier";
    }
}
