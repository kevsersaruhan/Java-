package practice05;

import java.util.ArrayList;
import java.util.List;

public class Q04 {
    /*
        Create an integer array with 5 elements
        Convert to a list
        Add 11, and 13 into the list, 11 will be at the beginning, 13 will be at index 3
        Increase the value of every element by 3
        Print the multiplication of the elements from index 2 to index 5
     */
    public static void main(String[] args) {

        int[] arr = {14,2,3,4,5};
        List<Integer> list = new ArrayList<Integer>();
        for(int i : arr){
            list.add(i);
        }
        list.add(0,11);
        list.add(3,13);

        for(int i=0;i<list.size(); i++){
            list.set(i,list.get(i)+3);
        }

        int result = 1;
        for(int i=2;i<6; i++){
            result*=list.get(i);
        }
        System.out.println(result);
    }
}
