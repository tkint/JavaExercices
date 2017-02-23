/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaires.personnel.employe.types;

import org.joda.time.DateTime;
import salaires.personnel.employe.Employe;

/**
 *
 * @author tkint
 */
public abstract class Type extends Employe {

    protected int facteur;

    public Type(String nom, String prenom, int age, String entree, int facteur) {
        super(nom, prenom, age, entree);
        this.facteur = facteur;
    }

    @Override
    public abstract float calculerSalaire();
}
