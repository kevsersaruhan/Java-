package practice04;

import java.util.Arrays;

public class Q09 {
    /*
        Type code to calculate the sum of the numbers for each inner arrays in a multidimentional array
        and print them on console as single-dimensional array.

     */
    public static void main(String[] args) {
        int[][] arr = {{10,20,30},{4},{6,7,20}};

        int[] sumArr = new int[arr.length];
        int idx = 0;
        for (int[] w : arr){
            int sum = 0;
            for(int x : w){
                sum+=x;
            }
            sumArr[idx] = sum;
            idx++;
        }
        System.out.println(Arrays.toString(sumArr));
    }
}
