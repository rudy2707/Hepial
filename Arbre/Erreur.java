/*
 * =====================================================================================
 *
 *       Filename:  Erreur.java
 *
 *    Description:  Gestion d'erreur en singleton.
 *                  Dès que l'on fait un ajout de message d'erreur dans le StringBuffer,
 *                  on met un booleen à 'true' pour indiquer que l'on a des bugs.
 *
 *        Version:  1.0
 *        Created:  17/06/2015 07:24:36 PM
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

public class Erreur {

    // Singleton
    private static Erreur instance;

    // Message d'erreur dans un StringBuffer
    private StringBuffer s;

    // Booleen pour savoir si on a eu des erreurs.
    private boolean bug = false;

    public Erreur() {
        this.s = new StringBuffer();
    }

    public static Erreur getInstance() {
        if (instance == null)
        {
            instance = new Erreur();
        }
        return instance;
    }

    public void checkBug() {
        if (!bug) {
            bug = true;
        }
    }

    /**
     * Ajoute une erreur en mettant le booleen à true si ce n'est pas déjà fait.
     */
    public void ajouter(String err) {
        checkBug();
        this.s.append("\n");
        this.s.append(err);
    }

    public StringBuffer getStringError() {
        return this.s;
    }

    public boolean isBug() {
        return bug;
    }

    public void afficheErreurs() {
        System.out.println(s);
    }

}
