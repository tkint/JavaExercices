/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaires.personnel.employe.types.production;

import salaires.personnel.employe.types.manutention.Manutentionnaire;
import org.joda.time.DateTime;
import salaires.personnel.Risque;

/**
 *
 * @author tkint
 */
public class TechnARisque extends Technicien implements Risque {

    public TechnARisque(String nom, String prenom, int age, String entree, int facteur) {
        super(nom, prenom, age, entree, facteur);
    }

    @Override
    public float calculerSalaire() {
        return super.calculerSalaire() + prime;
    }
}
