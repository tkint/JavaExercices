/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaires.personnel.employe.types.manutention;

import org.joda.time.DateTime;
import salaires.personnel.employe.Employe;
import salaires.personnel.employe.types.Type;

/**
 *
 * @author tkint
 */
public class Manutentionnaire extends Type {

    public Manutentionnaire(String nom, String prenom, int age, String entree, int facteur) {
        super(nom, prenom, age, entree, facteur);
    }

    @Override
    public float calculerSalaire() {
        return this.facteur * 65;
    }

    @Override
    public String getNom() {
        return "Le manutentionnaire " + super.getNom();
    }
}
