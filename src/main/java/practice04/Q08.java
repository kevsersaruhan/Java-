package practice04;

import java.util.Arrays;

public class Q08 {
    public static void main(String[] args) {
        //Write code to find the sum of the euros in the given string.

        String s = "$1 $12 €34 €56 $45 €78";
        String[] arr=s.split(" ");
        System.out.println(Arrays.toString(arr));
        int sumEuros =0;
        for(String str : arr){
            if(str.contains("€")){
                sumEuros+=Integer.valueOf(str.replace("€",""));
            }
        }
        System.out.println(sumEuros);
    }
}
