/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import genericite.Solo;

/**
 *
 * @author tkint
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solo<String> val= new Solo<>("toto");
        String test = val.getValeur();
        System.out.println(test);
    }
}
