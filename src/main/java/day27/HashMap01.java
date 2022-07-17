package day27;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
    public static void main(String[] args) {
        Map<String, Integer> hMap = new HashMap<>();
        hMap.put("A",12);
        hMap.put("B",12);
        hMap.put("r",6);
        hMap.put(null,13);


        //Type code to find the number of occurences of letters in a String
        //"toms are phantoms" ==>t=2 o=2 m=2 s=2 a=2 r=1

        String sentence = "13 ,  toms are phantoms?";
        String edit = sentence.replaceAll("[^a-zA-Z]","");
        String[] arr = edit.split("");

        Map<String, Integer> result = new HashMap<>();
        for (String w :arr){
            Integer counter = result.get(w);
            if(counter ==null){
                result.put(w,1);
            } else {
                result.put(w, counter+1);
            }
        }
        System.out.println(result);
    }
}
