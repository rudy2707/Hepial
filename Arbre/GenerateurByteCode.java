/*
 * =====================================================================================
 *
 *       Filename:  GenerateurByteCode.java
 *
 *    Description:  Implémente l'interface visiteur.
 *
 *                  Produit le code cible.
 *                  Il faut définir les opérations visiter(Nombre n) et
 *                  visiter(Idf i) ainsi que les méthodes visiter()
 *                  de chaque opérateur.
 *
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

public interface GenerateurByteCode implements Visiteur {

    private static cible = new StringBuilder();


    // Méthodes visiter() des différents éléments.
    // Nombre
    public Object visiter(Nombre n) {
        int valeur = n.valeur();
        if (valeur <= 5)
            cible.append(" iconst_" + valeur);
        else
            cible.append(" bipush " + valeur);
        return null;
    }

    // Opérations
    Object visiter(Addition a);
    Object visiter(Soustraction s);
    Object visiter(Produit p);
    Object visiter(Division d);

    // Comparaison
    Object visiter(Egal e);
    Object visiter(Inferieur e);
    Object visiter(InfEgal e);
    Object visiter(Superieur e);
    Object visiter(SupEgal e);
    Object visiter(Different e);

    Object visiter(Affectation a);
    Object visiter(Idf i);
    // TODO : Condition, Pour, Appel de fonction, Bloc, ...

}
