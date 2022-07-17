package practice06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q07 {
    /*
        Find the sum of the least and the greatest price given in a String list
        Example: List<String> myList = new List<String>{"$12.99","$8.25","$23.60","$54.45");

     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("$12.99","$8.25","$23.60","$54.45");
        System.out.println(myList);
        List<Double> doubleList = new ArrayList<>();
        for(String s : myList){
            doubleList.add(Double.valueOf(s.replace("$","")));
        }
        Collections.sort(doubleList);
        System.out.println(doubleList.get(doubleList.size()-1)+doubleList.get(0));
    }
}
