package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator<P> {

    public class ComparePets extends Comparator<Pet> {

        public int compare(Pet p1, Pet p2) {
            return p1.getName().compareTo(p2.getName());
        }

        public ArrayList<Pet> sortList(ArrayList<Pet> petList) {
            Collections.sort(petList, java.util.Comparator.comparing(Pet::getName));
            return petList;
        }
    }
}
