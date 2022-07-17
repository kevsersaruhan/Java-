package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        /*
            Create an integer array by the help of user( ask user length and elements of array)
            Ask user the index of element that user wants to remove.
            Print array on the console after removing
         */

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        int arr[]=new int[size];

        for (int i=0;i<size;i++){
            System.out.println("Enter element "+(i+1)+" : ");
            arr[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int brr[]=new int[arr.length-1];

        System.out.println("Enter index of elements you want to remove: ");
        int removeIdx = scan.nextInt();

        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(i==removeIdx){
                continue;
            }else {
                brr[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));
    }
}
