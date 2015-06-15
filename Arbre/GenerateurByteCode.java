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
 *                  C'est aussi un singleton.
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

public class GenerateurByteCode implements Visiteur {

    private static GenerateurByteCode instance = null;
    private static StringBuilder cible = new StringBuilder();

    public static GenerateurByteCode getInstance() {
        if (instance == null) {
            instance = new GenerateurByteCode();
        }
        return instance;
    }

    public void genereCode(ArbreAbstrait a) {
        a.accepter(this);
    }

    public StringBuilder getCible() {
        return this.cible;
    }

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

    // Binaire
    public Object visiter(Binaire b) {
        b.gauche().accepter(this);
        b.droit().accepter(this);
        //cible.append(b.mnemonique());
        return null;
    }

    // Opérations
    public Object visiter(Addition a) {
        a.gauche().accepter(this);
        a.droit().accepter(this);
        return null;
    }

    public Object visiter(Soustraction s) {
        return null;
    }

    public Object visiter(Produit p) {
        return null;
    }
    public Object visiter(Division d) {
        return null;
    }

    // Comparaison
    public Object visiter(Egal e) {
        return null;
    }

    public Object visiter(Inferieur e) {
        return null;
    }

    public Object visiter(InfEgal e) {
        return null;
    }

    public Object visiter(Superieur e) {
        return null;
    }

    public Object visiter(SupEgal e) {
        return null;
    }

    public Object visiter(Different e) {
        return null;
    }

    public Object visiter(Affectation a) {
        // Code cible pour la source.
        a.source().accepter(this);
        // Code cible pour l'affectation.
        cible.append(" istore ");

        return null;
    }

    public Object visiter(Condition c) {
        return null;
    }

    public Object visiter(Ident i) {
        return null;
    }

    public Object visiter(Idf i) {
        cible.append(" iload");

        return null;
    }

    public Object visiter(Bloc b) {
        return null;
    }




    // TODO : Condition, Pour, Appel de fonction, Bloc, ...

}
