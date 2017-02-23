/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaires.personnel.employe.types.manutention;

import org.joda.time.DateTime;
import salaires.personnel.Risque;

/**
 *
 * @author tkint
 */
public class ManutARisque extends Manutentionnaire implements Risque {

    public ManutARisque(String nom, String prenom, int age, String entree, int facteur) {
        super(nom, prenom, age, entree, facteur);
    }

    @Override
    public float calculerSalaire() {
        return super.calculerSalaire() + prime;
    }
}
