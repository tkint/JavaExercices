/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author tkint
 */
public class DemoCollection {

    public static void main(String[] args) {
        List<String> listeChaine = new ArrayList<>();
        List<Personne> personnes = new ArrayList<>();
        for (int i = 9; i > -1; i--) {
            listeChaine.add("abc" + i);
            personnes.add(new Personne("Nom " + i, "Prenom " + i));
        }
//        for (String s : listeChaine) {
//            System.out.println(s);
//        }
//        Collections.sort(listeChaine);
//        for (String s : listeChaine) {
//            System.out.println(s);
//        }
        for (Personne p : personnes) {
            System.out.println(p.toString());
        }
        Collections.sort(personnes);
        for (Personne p : personnes) {
            System.out.println(p.toString());
        }
    }
}
