/*
 * =====================================================================================
 *
 *       Filename:  TDS.java
 *
 *    Description:  Implémentation de la table des symboles.
 *
 *        Version:  1.0
 *        Created:  04/21/2015 07:24:36 PM
 *       Revision:  none
 *       Compiler:  javac
 *
 *         Author:  Axel Fahy (), axel.fahy@etu.hesge.ch
 *   Organization:  HES-SO hepia section ITI
 *
 * =====================================================================================
 */

package Arbre;


/*
 * Les symboles vont être stockés dans une hashmap.
 *
 * Avec les fonctions, il va y avoir des blocs.
 *
 * A chaque entrée de bloc, on empile, quand on sort d'un bloc, on dépile.
 *
 * Est-ce suffisant ???
 *
 */

import java.util.*;

//import Entree.java;
//import Symbole.java;

public class TDS {

    // Singleton.
    private static TDS instance;

    // Une entrée correspond à un nom de variables, fonctions.
    // Un symbole correspond à un type (ex : int).
    public HashMap<Entree, Symbole> bloc;

    public Stack<HashMap<Entree, Symbole>> stack;

    /**
     *  Constructeur
     *
     *  Création de la table (premier bloc) et de la pile.
     */
    public TDS() {
        this.bloc = new HashMap<Entree, Symbole>();
        this.stack = new Stack<HashMap<Entree, Symbole>>();
    }

    /**
     *  Retourne une instance de TDS. C'est un singleton.
     *  S'il n'existe pas, il est créé.
     */
    public static TDS getInstance() {
        if (instance == null)
		{
            instance = new TDS();
		}
		return instance;
    }

    /**
     *  Ajout d'une entrée dans la table courante.
     */
    public void ajouter(Entree e, Symbole s) {
        this.bloc.put(e, s);
    }

    /**
     *  Identification d'une entrée.
     */
    public Symbole identifier(Entree e) {
        return this.bloc.get(e);
    }

    /**
     *  Entrée dans un bloc.
     *
     *  A chaque entrée dans un bloc, on créé un nouveau bloc.
     *  Le nouveau bloc devient le bloc courant et l'ancien bloc
     *  est mis dans la pile.
     *
     */
    public void entreeBloc() {
        HashMap<Entree, Symbole> newBloc = new HashMap<Entree, Symbole>();
        this.stack.push(this.bloc);
        this.bloc = newBloc;
    }


    /**
     *  Le bloc courant est remplacé par son parent.
     *
     *  Son parent est le bloc au sommet de la pile.
     */
    public void sortieBloc() {
        this.bloc = this.stack.pop();
    }

}

