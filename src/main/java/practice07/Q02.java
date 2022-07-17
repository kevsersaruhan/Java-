package practice07;

import java.sql.Array;
import java.util.Arrays;

public class Q02 {

    /*
        Create a method accepts a name as parameter
        and prints the name as a char array
        (do not use toCharArray() method)

        Input: John
        Output : [J, o, h, n]
     */

    public static void main(String[] args) {

        nameArr("John");
    }
    
    public static void nameArr(String name){
        String[] arr = new String[name.length()];
        for(int i=0;i<name.length();i++){
            arr[i]=String.valueOf(name.charAt(i));
        }
        System.out.println(Arrays.toString(arr));
    }
}
