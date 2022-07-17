package practice04;

import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {
        /*
        Type code to find the minimum, maximum and second-maximum number in the array?

        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
        output: min:-90, max:10001, secMax: 8787

       */
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
        Arrays.sort(arr);
        System.out.println("Min: "+arr[0]);
        System.out.println("Max: "+arr[arr.length-1]);
        System.out.println("Second max: "+arr[arr.length-2]);

        //2nd:
        int min=0;
        int max=0;
        int secMax=0;
        for(int w:arr){
            if(w<min){
                min=w;
            }
            if(w>max){
                secMax=max;
                max=w;
            } else if (w>secMax) {
                secMax=w;
            }
        }
        System.out.println("min:"+min+" max:"+max+" secMax:"+secMax);
    }
}
