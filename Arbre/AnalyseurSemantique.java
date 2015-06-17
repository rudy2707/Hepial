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

    /**
     * Fonction pour vérifier les operandes d'une opération.
     * Cette fonction est appellé pour tous les éléments héritant de la classe 'Binaire'.
     */
    public void checkBinaire(Binaire b) {
        // Vérifie les types d'une opération binaire et si la variable existe.
        System.out.println("--------------------------------Gauche : " + b.gauche());
        b.gauche().accepter(this);
        System.out.println("Type check : " + b.gauche().getType());
        if (b.gauche().getType() != null) {
            if (!b.gauche().getType().estConforme(TypeEntier.getInstance())) {
                // Type non conforme.
                Erreur.getInstance().ajouter("Opération : erreur de type avec la variable " + b.gauche() + " (" + b.gauche().getType() + ")");
            }
        }
        else {
            // Type inconnu.
            Erreur.getInstance().ajouter("Opération : erreur de type avec la variable " + b.droit() + " (inconnu)");
        }

        System.out.println("--------------------------------Droit : " + b.droit());
        System.out.println("Type check : " + b.gauche().getType());
        b.droit().accepter(this);
        if (b.droit().getType() != null) {
            if (!b.droit().getType().estConforme(TypeEntier.getInstance())) {
                // Type non conforme.
                Erreur.getInstance().ajouter("Opération : erreur de type avec la variable " + b.droit() + " (" + b.droit().getType() + ")");
            }
        }
        else {
            // Type inconnu.
            Erreur.getInstance().ajouter("Opération : erreur de type avec la variable " + b.droit() + " (inconnu)");
        }
    }


    public void analyse(ArbreAbstrait arbre) {
        arbre.accepter(this);
    }

    // Méthodes visiter() des différents éléments.
    // Opérations
    public Object visiter(Addition a) {
        checkBinaire(a);
        return null;
    }

    public Object visiter(Soustraction s) {
        checkBinaire(s);
        return null;
    }

    public Object visiter(Produit p) {
        checkBinaire(p);
        return null;
    }

    public Object visiter(Division d) {
        checkBinaire(d);
        return null;
    }

    // Comparaison
    public Object visiter(Egal e) {
        checkBinaire(e);
        return null;
    }

    public Object visiter(Inferieur e) {
        checkBinaire(e);
        return null;
    }

    public Object visiter(InfEgal e) {
        checkBinaire(e);
        return null;
    }

    public Object visiter(Superieur e) {
        checkBinaire(e);
        return null;
    }

    public Object visiter(SupEgal e) {
        checkBinaire(e);
        return null;
    }

    public Object visiter(Different e) {
        checkBinaire(e);
        return null;
    }

    private static String ncf = "Source et dest. non conforme !";
    public Object visiter(Affectation a) {
        a.dest().accepter(this);    // Vérifie si l'identifiant destination est correct.
        Type typeDest = a.dest().getType();
        Object v = a.source().accepter(Evaluateur.getInstance());

        if (v != null)
            a.setSource(new Nombre((Integer)v, 1));

        a.source().accepter(this);
        Type typeSource = a.source().getType();

        System.out.println("Typedest : " + typeDest);
        System.out.println("Typesource : " + typeSource);

        if (typeSource != null && typeDest != null) {
            if (!(typeSource.estConforme(typeDest))) {
                // Erreur
                Erreur.getInstance().ajouter("Erreur affectation sémantique.");
                Erreur.getInstance().ajouter(ncf);
            }
            else {
                a.setType(typeDest);
            }
        }
        else {
            Erreur.getInstance().ajouter("Erreur affectation : le type n'est pas conforme.");
        }
        return null;
    }


    public Object visiter(Idf i) {
        System.out.println("i : " + i);
        Symbole s = TDS.getInstance().getSymbole(new EntreeEntBool(new Ident(i.getName())));
        System.out.println("Symbole a: " + s);
        if (s == null) {    // Pas de type, erreur.
            Erreur.getInstance().ajouter("Erreur : l'identifiant " + i + " n'existe pas.");
            Erreur.getInstance().ajouter("Erreur, pas de type récupéré.");
        }
        else {
            // On attribut le type à l'identifiant pour qu'il soit récupérable
            // depuis l'affectation ainsi que les autres méthodes visiter().

            System.out.println("Value symbole : " + s);
            i.setType(s.getType());
        }

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

    // TODO : Condition, Pour, Appel de fonction,  ...

}
