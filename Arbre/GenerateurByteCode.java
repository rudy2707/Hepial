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
        /*if (valeur <= 5)
            cible.append(" iconst_" + valeur + "\n");
        else
            cible.append(" bipush " + valeur + "\n");
        */
        cible.append("ldc " + valeur);
        cible.append("istore " n.getPile());
        return null;
    }

    // Binaire
    public Object visiter(Binaire b) {
        System.out.println("Byte : Binaire : " + b);
        b.gauche().accepter(this);
        b.droit().accepter(this);
        //cible.append(b.mnemonique());
        return null;
    }

    // Opérations
    public Object visiter(Addition a) {
        System.out.println("Byte : Addition : " + a);
        a.gauche().accepter(this);
        a.droit().accepter(this);

        cible.append("iload " + a.gauche().getPile());
        cible.append("iload " + a.droit().getPile());
        cible.append("iadd");
        //cible.append("istore " + );

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
        cible.append("istore " + a.destination().getPile());

        return null;
    }

    public Object visiter(Condition c) {
        return null;
    }

    public Object visiter(Idf i) {
        cible.append("iload " + i.getPile() + "\n");

        return null;
    }

    public Object visiter(Bloc b) {
        System.out.println("Byte : Bloc : " + b);

		/*cible.append(".class public Main\n");
		cible.append(".super java/lang/Object\n");

		cible.append(".method public <init>()V\n");
		cible.append("	aload_0\n; push this\n");
		cible.append("	invokespecial java/lang/Object/<init>()V\n");
		cible.append("	return\n");
		cible.append(".end method\n");
        
		cible.append(".method public static main([Ljava/lang/String;)V\n");
		cible.append("	.limit stack " + TDS.getInstance().bloc.size());
        cible.append("\n");
		cible.append("	.limit locals " + TDS.getInstance().bloc.size());
        cible.append("\n");

		//bloc.instructions().accept(this);
        for (int i = 0; i < b.instr().size(); i++) {
            b.instr().get(i).accepter(this);
        }
		cible.append("	return\n");
		cible.append(".end method\n");
        */
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

        //; allocate stack big enough to hold 2 items
        cible.append(".limit stack 4\n");
        cible.append(".limit locals 4\n");
   
        //; push java.lang.System.out (type PrintStream)
        // cible.append("getstatic java/lang/System/out Ljava/io/PrintStream;\n");
   
        //; push string to be printed
        //cible.append("ldc \"J'men fous\"\n");
        cible.append("ldc 9\n");
        cible.append("ldc 5\n");
        cible.append("getstatic java/lang/System/out Ljava/io/PrintStream;\n");
        
        cible.append("iadd\n");
        //; invoke println
        cible.append("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n");
   
        //; terminate main
        cible.append("return\n");

        cible.append(".end method\n");
        return null;
    }




    // TODO : Condition, Pour, Appel de fonction, Bloc, ...

}
