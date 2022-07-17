package day17;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        /*
            Count the words in a String one by one
            String is "Ali came to school and Ayse came to school"
            Ali =1, came =2, to=2, school = 2, and = 1, Ayse=1

         */

        String s ="Ali came to school and Ayse came to school";
        s.replaceAll("\\p{Punct}","");
        String[] st = s.split(" ");
        String word="";
        List<String> list = new ArrayList<>();
        for(String w : st){
            list.add(w);
        }

        int counter = 1;
        for(int i=0; i<list.size();i++){
            word=list.get(i);
            for(int j=i+1;j<list.size();j++){
                if (word.equals(list.get(j))){
                    counter++;
                    list.remove(j);
                    j--;

                }

            }
            System.out.println(st[i]+" = "+counter);
            counter=1;
        }
    }
}
