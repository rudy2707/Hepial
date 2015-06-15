/*
 * =====================================================================================
 *
 *       Filename:  ArbreAbstrait.java
 *
 *    Description:  Base de l'arbre.
 *                  MàJ 04.06.2015 - Devient une interface.
 *
 *                  L'inteface contient la méthode 'accepter()' que les classes filles
 *                  devront implémenter.
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

public interface ArbreAbstrait {

    public Object accepter(Visiteur v);
}
