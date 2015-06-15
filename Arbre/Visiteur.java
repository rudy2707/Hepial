/*
 * =====================================================================================
 *
 *       Filename:  Visiteur.java
 *
 *    Description:  Interface visiteur.
 *                  C'est interface contient les différentes méthodes 'visit()' relatives
 *                  aux différents éléments de l'arbre abstrait.
 *
 *        Version:  1.0
 *        Created:  04/06/2015 09:24:36 PM
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

public interface Visiteur {

    Object visiter(Bloc b);

    // Méthodes visiter() des différents éléments.
    // Opérations
    Object visiter(Addition a);
    Object visiter(Soustraction s);
    Object visiter(Nombre n);
    //Object visiter(Produit p);
    //Object visiter(Division d);

    // Comparaison
    Object visiter(Egal e);
    //Object visiter(Inferieur e);
    //Object visiter(InfEgal e);
    //Object visiter(Superieur e);
    //Object visiter(SupEgal e);
    //Object visiter(Different e);

    Object visiter(Affectation a);
    Object visiter(Idf i);
    Object visiter(Ident i);
    Object visiter(Condition c);
    // TODO : Pour, Appel de fonction, Bloc, ...

}
