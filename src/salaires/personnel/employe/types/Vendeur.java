/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaires.personnel.employe.types;

import org.joda.time.DateTime;

/**
 *
 * @author tkint
 */
public class Vendeur extends Type {

    public Vendeur(String nom, String prenom, int age, String entree, int facteur) {
        super(nom, prenom, age, entree, facteur);
    }

    @Override
    public float calculerSalaire() {
        return this.facteur * 0.2f + 400;
    }

    @Override
    public String getNom() {
        return "Le vendeur " + super.getNom();
    }
}
