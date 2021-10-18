package com.company;

import java.util.*;

import static javax.swing.UIManager.get;

public class Main {

    public static void main(String[] args) {
        Double d = 2.3;
        Double tab[] = new Double[3];
        tab[0] = 2.5;
        tab[1] = -2.3;
        tab[2] = 4.5;

        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);

        Arrays.sort(tab);

        System.out.println("sorted data");
        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);

        tab[2] = null; // wyczyszczenie komorki

        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);

        Double largerTab[] = new Double[4];
        largerTab[0] = tab[0];
        largerTab[1] = tab[1];
        largerTab[2] = tab[2];
        largerTab[3] = 0.0;

        System.out.println("larger tab: ");
        System.out.println(largerTab[0]);
        System.out.println(largerTab[1]);
        System.out.println(largerTab[2]);
        System.out.println(largerTab[3]);

        //
        // for (int i=0;i< tab.length; i++) {
        //     largerTab[i] = tab[i];
        // }
        // largerTab[largerTab.length-1]=0.0;

        List<Double> testList = new LinkedList<Double>(); //there will be a list of doubles, reserve space for the first element
        testList.add(2.3);
        testList.add(7.0);
        System.out.println(testList.size());
        testList.add(-3.0);
        System.out.println(testList.size());
        testList.add(0.0);
        System.out.println(testList.size());
        testList.add(2, 4.5);
        testList.remove(1);

        Collections.sort(testList);
        System.out.println("sorted list:");
        //System.out.println(testList.get(0));
        //System.out.println(testList.get(1));
        //System.out.println(testList.get(2));
        //System.out.println(testList.get(3)); - bez sensu, bo nie znamy długości listy, poza tym powt

        for (int i = 0; i < testList.size(); i++) {
            System.out.println(testList.get(i));
        }

        for (int i = 0; i < testList.size(); i++) {
            Double elem = testList.get(i);
            System.out.println(elem);
        }

        for (Double elem : testList) { //utwórz zmienną elem dla każdego elementu listy
            System.out.println(elem);
        }

        Set<Double> testSet = new TreeSet<>();
        testSet.add(0.0);
        testSet.add(2.3);
        testSet.add(-1.1);
        testSet.add(4.5);
        testSet.add(4.5);
        testSet.add(-4.5);

        testSet.remove(0.0);

            System.out.println("test set:");
        for (Double elem : testSet) {
            System.out.println(elem);
        }

        String[] texts = new String[4];
        texts[0] = "qwerty";
        texts[1] = "asdf";
        texts[2] = "fhdja";
        texts[3] = "maiu";

        System.out.println(texts[2]);

        List<String> listOfTexts = new LinkedList<String>();
        listOfTexts.add("hehe");
        listOfTexts.add("haha");
        listOfTexts.add("hejżehola");

        Set<String> setOfTexts = new TreeSet<String>();
        setOfTexts.add("wsb");
        setOfTexts.add("jest");
        setOfTexts.add("jest");
        setOfTexts.add("jest");
        setOfTexts.add("lepsze");
        setOfTexts.add("niż");
        setOfTexts.add("Harvard");

        System.out.println("table:");
        for (int i = 0; i < texts.length; i++) {
            System.out.println(texts[i]);
        }

        Arrays.sort(texts);

        for (int i = 0; i < texts.length; i++) {
            System.out.println(texts[i]);
        }

        System.out.println("list:");
        System.out.println(listOfTexts);
        Collections.sort(listOfTexts);
        System.out.println(listOfTexts);

        System.out.println("set:");
        System.out.println(setOfTexts);






    }
}
