/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaires.personnel;

import java.util.ArrayList;
import salaires.personnel.employe.Employe;

/**
 *
 * @author tkint
 */
public class Personnel {

    private ArrayList<Employe> employes;

    public Personnel() {
        this.employes = new ArrayList<>();
    }
    
    public void ajouteEmploye(Employe employe) {
        this.employes.add(employe);
    }
    
    public void afficherSalaire() {
        for (Employe employe : this.employes) {
            System.out.println(employe.getNom() + " gagne " + employe.calculerSalaire() + " francs.");
        }
    }
    
    public double salaireMoyen() {
        int i = 0;
        float somme = 0;
        while (i < this.employes.size()) {
            somme += this.employes.get(i).calculerSalaire();
            i++;
        }
        return somme / i;
    }
}
