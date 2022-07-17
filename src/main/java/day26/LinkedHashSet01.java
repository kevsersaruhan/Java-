package day26;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
/*
    1)LinkedHashSet puts the elements in insertion order

 */

    public static void main(String[] args) {
        LinkedHashSet<String> lhSet = new LinkedHashSet<>();

        lhSet.add("A");
        lhSet.add("BFED");
        lhSet.add("ZK");
        lhSet.add("M");
        lhSet.add("KLM12");
        lhSet.add("?");

        System.out.println("First Null :"+lhSet.add(null));//true
        System.out.println("Second Null :"+lhSet.add(null)); //false
        System.out.println(lhSet);//[A, BFED, ZK, M, KLM12, ?, null]

    }
}
