/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaires.personnel.employe;

import org.joda.time.DateTime;

/**
 *
 * @author tkint
 */
public abstract class Employe {

    private String nom;
    private String prenom;
    private int age;
    private DateTime entree;

    public Employe(String nom, String prenom, int age, String entree) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.entree = new DateTime(Integer.parseInt(entree), 1, 1, 0, 0);
    }

    public abstract float calculerSalaire();

    public String getNom() {
        return prenom + " " + nom;
    }
}
