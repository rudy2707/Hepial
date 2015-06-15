/*
 * =====================================================================================
 *
 *       Filename:  AnalyseurSemantique.java
 *
 *    Description:  Implémente l'interface visiteur.
 *                  C'est cette classe qui implémente les contrôles sémantiques.
*                   (Vérifie les types, ...)
*                   Cette classe est également un singleton.
 *
 *        Version:  1.0
 *        Created:  04/06/2015 10:03:36 PM
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

public class AnalyseurSemantique implements Visiteur {
    // Singleton
    private static AnalyseurSemantique instance = null;;

    public AnalyseurSemantique() {

    }

    public static AnalyseurSemantique getInstance() {
        if (instance == null)
        {
            instance = new AnalyseurSemantique();
        }
        return instance;
    }

    public void analyse(ArbreAbstrait arbre) {
        arbre.accepter(this);
    }

    // Méthodes visiter() des différents éléments.
    // Opérations
    public Object visiter(Addition a) {
        System.out.println("---------------------------Analyseur Visiter addition.");
        // Vérifie les types de l'addition.
        a.gauche().accepter(this);
        if (!a.gauche().getType().estConforme(TypeEntier.getInstance())) {
            System.out.println("---------------------------Erreur de type.");
        }

        a.droit().accepter(this);
        if (!a.droit().getType().estConforme(TypeEntier.getInstance())) {
            System.out.println("---------------------------Erreur de type.");
        }
        return null;
    }

    public Object visiter(Soustraction s) {
        // Vérifie les types de la soustraction.
        s.gauche().accepter(this);
        if (!s.gauche().getType().estConforme(TypeEntier.getInstance())) {
            // TODO : Error
        }

        s.droit().accepter(this);
        if (!s.droit().getType().estConforme(TypeEntier.getInstance())) {
            // TODO : Error
        }
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

    private static String ncf = "Source et dest. non conforme !";
    public Object visiter(Affectation a) {
        System.out.println("Debut Affectation sémantique");
        a.dest().accepter(this);    // Vérifie si l'identifiant destination est correct.
        System.out.println("2");
        Type typeDest = a.dest().getType();
        System.out.println("3");
        //a.source().accepter(this);  // Vérifie si l'expression source est correct.
        //Type tg = a.source().getType();
        Object v = a.source().accepter(Evaluateur.getInstance());
        System.out.println("4");

        if (v != null)
            a.setSource(new Nombre((Integer)v, 1));
        System.out.println("5");

        a.source().accepter(this);
        System.out.println("6");
        Type typeSource = a.source().getType();
        System.out.println("a");
        System.out.println(a);

        System.out.println(typeDest);
        System.out.println(typeSource);
        System.out.println("b");

        if (!(typeSource.estConforme(typeDest))) {
            // Erreur
            System.out.println("Error affectation sémantique");
            System.out.println(ncf);
            System.out.println("8");
        }
        else {
            System.out.println("9");
            a.setType(typeDest);
            System.out.println("10");
        }
        return null;
    }


    public Object visiter(Idf i) {
        System.out.println("Idf visiter");
        System.out.println(i.getName());
        Ident id = new Ident(i.getName());
        System.out.println("id : " + id);
        EntreeEntBool e = new EntreeEntBool(id);
        System.out.println("e : " + e.ident());
        Symbole s = TDS.getInstance().getSymbole(e);
        System.out.println(s);


        System.out.println("Affichage de TDS : ");
        System.out.println("Taille de TDS : " + TDS.getInstance().bloc.size());

        for (Map.Entry entry : TDS.getInstance().bloc.entrySet()) {
            System.out.println("Ident : " + entry.getKey() + " / Type : " + entry.getValue());
        }

        if (s == null) {    // Pas de type, erreur.
            System.out.println("Erreur, pas de type récupéré.");
        }
        else {
            // Test le type.
            System.out.println(s);
        }

        return null;
    }

    public Object visiter(Ident i) {
        //System.out.println("Ident visiter");
        //Symbole s = TDS.getInstance().getSymbole(i.getName());
        //if (s == null) {    // Pas de type, erreur.
        //    System.out.println("Erreur, pas de type récupéré.");
        //}
        //else {
        //    // Test le type.
        //    System.out.println(s);
        //}

        return null;
    }

    public Object visiter(Nombre n) {
        return null;
    }

    private static String eb = "Expression booléenne attendue !";
    public Object visiter(Condition c) {
    //    Object v = c.condition().accepter(Evaluateur.getInstance());
    //    if (v != null)
    //        c.setValeurCondition()
        return null;
    }

    public Object visiter(Bloc b) {
        //TDS.getInstance().entreeBloc();
        // Appelle la méthode accepter pour chaque instruction.
        System.out.println("Visiter bloc b avant");
        for (int i = 0; i < b.instr().size(); i++) {
            b.instr().get(i).accepter(this);
        }
        System.out.println("Visiter bloc b après");
        //TDS.getInstance().sortieBloc();
        return null;
    }

    // TODO : Condition, Pour, Appel de fonction, Bloc, ...

}
