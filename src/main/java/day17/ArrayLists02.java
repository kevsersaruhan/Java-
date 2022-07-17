package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {
        /*
            From a given list find all pairs whose sum is a given number
            {4, 6, 5, -10, 8, 5,20 ==> 10
            for example; 4+6=10, 5+5=10, -10+20 =10
         */

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(-10);
        list.add(8);
        list.add(5);
        list.add(20);

        int givenNum = 10;
        Collections.sort(list);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==givenNum){
                    System.out.println(list.get(i)+" + "+list.get(j)+" = "+givenNum);
                } else if(list.get(i)+list.get(j)>givenNum){
                    break;
                }
            }
        }
    }
}
