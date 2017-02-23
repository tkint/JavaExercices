/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensemble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author tkint
 */
public class Ensemble {

    public static void main(String[] args) {
        ArrayList<String> ensemble1 = new ArrayList<>();
        ensemble1.add("Chat");
        ensemble1.add("Chien");
        ensemble1.add("Chien");
        ensemble1.add("Hamster");
        ensemble1.add("Hamster");
        ensemble1.add("Hamster");
        ensemble1.add("Girafe");
        ensemble1.add("Elephant");

        ArrayList<String> ensemble2 = new ArrayList<>();
        ensemble2.add("Girafe");
        ensemble2.add("Bison");
        ensemble2.add("Bison");
        ensemble2.add("Chien");
        ensemble2.add("Mulet");
        ensemble2.add("Cerf");
        ensemble2.add("Chat");
        ensemble2.add("Elan");
        ensemble2.add("Baleine");
        ensemble2.add("Alpaga");

        ArrayList<String> ensemble3 = union(ensemble1, ensemble2);

        Collections.sort(ensemble3);

        System.out.println(ensemble3.toString());
    }

    static ArrayList<String> union(ArrayList<String> ensemble1, ArrayList<String> ensemble2) {
        Set<String> union = new HashSet<>(ensemble1);
        union.addAll(ensemble2);

        return new ArrayList<>(union);
    }

    static ArrayList<String> intersection(ArrayList<String> ensemble1, ArrayList<String> ensemble2) {
        Set<String> resultSet = new HashSet<>(ensemble1);
        resultSet.retainAll(ensemble2);

        ArrayList<String> result = new ArrayList<>(resultSet);

        return result;
    }

    static ArrayList<String> difference(ArrayList<String> ensemble1, ArrayList<String> ensemble2) {
        ArrayList<String> result = new ArrayList<>();

        result.addAll(ensemble1);
        result.removeAll(ensemble2);

        return result;
    }

    static ArrayList<String> differenceSymetrique(ArrayList<String> ensemble1, ArrayList<String> ensemble2) {
        Set resultSet = new HashSet(union(ensemble1, ensemble2));

        ArrayList<String> result = new ArrayList<>(resultSet);

        return result;
    }
}
