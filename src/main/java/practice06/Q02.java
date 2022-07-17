package practice06;

import java.util.ArrayList;
import java.util.List;

public class Q02 {
    /*
        Type code to find the common elements between two String Arrays
        (without case sensitivity)
        Input 1 :{John,Brad,Angel,Sofia,Emily}
        Input 2 :{sofia,brad,emily,hazel}
        Output [brad, sofia,emily]
     */
    public static void main(String[] args) {

        String[] arr1 = {"John","Brad","Angel","Sofia","Emily"};
        String[] arr2 = {"sofia","grace","brad","emily","hazel"};
        List<String> list = new ArrayList<String>();


        for (String s : arr1){
            for(String w : arr2){
                if(s.equalsIgnoreCase(w)){
                    list.add(s);
                }
            }
        }
        System.out.println(list);

    }
}
