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
    public static int trucEcrire = 0;

    public static GenerateurByteCode getInstance() {
        if (instance == null) {
            instance = new GenerateurByteCode();
        }
        return instance;
    }

    public void genereCode(ArbreAbstrait a) {
        System.out.println("Byte : genereCode : " + a);
        a.accepter(this);
    }

    public StringBuilder getCible() {
        return this.cible;
    }

    // Méthodes visiter() des différents éléments.
    // Nombre
    public Object visiter(Nombre n) {
        System.out.println("Byte : Nombre : " + n);
        int valeur = n.valeur();
        cible.append("ldc " + valeur + "\n");
        return null;
    }

    // Binaire
    public Object visiter(Binaire b) {
        System.out.println("Byte : Binaire : " + b);
        b.gauche().accepter(this);
        b.droit().accepter(this);
        return null;
    }

    // Opérations
    public Object visiter(Addition a) {
        System.out.println("Byte : Addition : " + a);
        a.gauche().accepter(this);
        a.droit().accepter(this);

        cible.append("iadd\n");

        return null;
    }

    public Object visiter(Soustraction a) {
        System.out.println("Byte : Soustraction : " + a);
        a.gauche().accepter(this);
        a.droit().accepter(this);

        cible.append("isub\n");

        return null;
    }

    public Object visiter(Produit a) {
        System.out.println("Byte : Produit : " + a);
        a.gauche().accepter(this);
        a.droit().accepter(this);

        cible.append("imul\n");

        return null;
    }
    public Object visiter(Division a) {
        System.out.println("Byte : Division : " + a);
        a.gauche().accepter(this);
        a.droit().accepter(this);

        cible.append("idiv\n");

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
        cible.append("istore " + ((Idf)a.dest()).getPile() + "\n");
        trucEcrire = ((Idf)a.dest()).getPile();
        return null;
    }

    public Object visiter(Condition c) {
        return null;
    }

    public Object visiter(Idf i) {
        cible.append("iload " + i.getPile() + "\n");

        return null;
    }

    public Object visiter(Ecrire e) {
        cible.append("getstatic java/lang/System/out Ljava/io/PrintStream;\n");
        cible.append("iload " + trucEcrire + "\n");
        //; invoke println
        cible.append("invokevirtual java/io/PrintStream/println(I)V\n");
        return null;
    }

    public Object visiter(Bloc b) {
        // Header
        cible.append(".class public Main\n");
        cible.append(".super java/lang/Object\n");

        //; default constructor
        cible.append(".method public <init>()V\n");
        cible.append("aload_0 ; push this\n");
        cible.append("invokespecial java/lang/Object/<init>()V ; call super\n");
        cible.append("return\n");
        cible.append(".end method\n");

        //; declare a new method
        cible.append(".method public static main([Ljava/lang/String;)V\n");

        //; allocate stack big enough to hold all items
        cible.append(".limit stack 10\n");
        cible.append(".limit locals 100\n");

        for (int i = 0; i < b.instr().size(); i++) {
            b.instr().get(i).accepter(this);
        }

        //; terminate main
        cible.append("return\n");

        cible.append(".end method\n");
        return null;
    }

    // TODO : Condition, Pour, Appel de fonction, Bloc, ...

}
