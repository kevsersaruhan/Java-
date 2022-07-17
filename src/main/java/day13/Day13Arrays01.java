package day13;

import java.util.Arrays;

public class Day13Arrays01 {
    public static void main(String[] args) {

        //Type code to print the sum of the min and max value of an integer array
        int arr[]={23, 12, 34, 10, 78, 19};

        int i = 0;


        System.out.println(Arrays.toString(arr));
        //Put the element in ascending order
        //sort() method in Arrays class puts the elements in ascending order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int minValue = arr[0];
        int maxValue = arr[arr.length-1];
        System.out.println(minValue+maxValue);//88

    }
}
