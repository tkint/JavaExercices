/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaires;

import salaires.personnel.Personnel;
import salaires.personnel.employe.types.Representant;
import salaires.personnel.employe.types.Vendeur;
import salaires.personnel.employe.types.manutention.ManutARisque;
import salaires.personnel.employe.types.manutention.Manutentionnaire;
import salaires.personnel.employe.types.production.TechnARisque;
import salaires.personnel.employe.types.production.Technicien;

/**
 *
 * @author tkint
 */
public class Salaires {
    public static void main(String[] args) {
        Personnel personnel = new Personnel();
        personnel.ajouteEmploye(new Vendeur("Pierre", "Business", 45, "1995", 30000));
        personnel.ajouteEmploye(new Representant("Léon", "Vendtout", 25, "1995", 20000));
        personnel.ajouteEmploye(new Technicien("Yves", "Bosseur", 28, "1995", 1000));
        personnel.ajouteEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32, "1998", 45));
        personnel.ajouteEmploye(new TechnARisque("Jean", "Flippe", 28, "2000", 1000));
        personnel.ajouteEmploye(new ManutARisque("Al", "Abordage", 30, "2001", 45));
        personnel.afficherSalaire();
        System.out.println("Le salaire moyen dans l'entreprise est de " + personnel.salaireMoyen() + " francs.");
    }
}