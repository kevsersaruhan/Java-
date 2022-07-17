package practice06;

import java.util.Arrays;

public class Q06 {
    /*
        Find the middle element in an integer array
        Example: (12,5,8) ==> (5,8,12) ==> Output =8
                 (12,5,8,13) ==> (5,8,12,13) ==> Output = (8+12)/2 = 10
     */

    public static void main(String[] args) {
        int[] arr1 = {12,5,8};
        Arrays.sort(arr1);
        int middle = arr1.length/2;
        if(arr1.length%2!=0){
            System.out.println(arr1[middle]);
        }else{
            System.out.println((arr1[middle]+arr1[middle+1])/2);
        }


    }
}
