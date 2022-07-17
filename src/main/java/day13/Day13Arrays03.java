package day13;

import java.util.Arrays;

public class Day13Arrays03 {
    public static void main(String[] args) {
        //[0,2, 0, 3, 12, 0] put the zeros to the end ==> [2, 3, 12, 0, 0, 0]

        int arr[]={0, 2, 3, 12, 0};
        int arr2[]=new int[arr.length];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr2[idx]=arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
