/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesure;

import javax.swing.JOptionPane;

/**
 *
 * @author tkint
 */
public class Cesure {

    public static void main(String[] args) {
        String[] phrase = lirePhrase();
        
        for (int i = 0; i < phrase.length; i++) {
            cesure(phrase[i]);
        }
    }
    
    static String[] lirePhrase() {
        String paneStr = JOptionPane.showInputDialog("Entrez une phrase");
        
        String[] mots = paneStr.split(" ");
        
        return mots;
    }
    
    static boolean voyelle(char c) {
        boolean result = false;
        char[] voyelles = {'a', 'e', 'i', 'o', 'u', 'y'};
        int i = 0;
        while (i < voyelles.length && !result) {
            if (c == voyelles[i]) {
                result = true;
            }
            i++;
        }
        return result;
    }
    
    static boolean queVoyelles(String s) {
        boolean result = true;
        char[] lettres = s.toCharArray();
        for (char lettre : lettres) {
            if (!voyelle(lettre)) {
                result = false;
            }
        }
        return result;
    }
    
    static void cesure(String mot) {
        if (!queVoyelles(mot)) {
            char[] lettres = mot.toCharArray();
            for (int i = 1; i < lettres.length - 1; i++) {
                if (voyelle(lettres[i]) && !voyelle(lettres[i + 1])) {
                    String reste = mot.substring(i + 1, mot.length());
                    mot = mot.substring(0, i + 1) + "-\n" + reste;
                    lettres = mot.toCharArray();
                    //System.out.println(reste);
                }
                
            }
            System.out.println(mot);
        }
    }
}
