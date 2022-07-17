package practice05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q05 {
    /*
    Create a method that converts a multidimensional array into a single and puts it into a list then prind elements in alphabetical order.
    eg : Input {{Ali,Veli, Ayse},{Hasam,Can},{Suzan}}
    Output: [Ali,Ayse,Can,Hasan,Suzan,Veli]
     */
    public static void main(String[] args) {

        String[][]arr = {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
        int lengthArr = 0;
        for (String[] s : arr){
            lengthArr += s.length;
        }
        String[] singleArr = new String[lengthArr];
        int i=0;
        for (String[] s : arr){
            for(String st : s ){
                singleArr[i]=st;
                i++;
            }
        }
        Arrays.sort(singleArr);
        System.out.println(Arrays.toString(singleArr));

        System.out.println(newList(arr));
    }

    public static List newList(String[][] arr){
        List<String> list = new ArrayList<>();

        for(String[] w: arr){
            for(String u: w){
                list.add(u);
            }
        }
        Collections.sort(list);
        return list;
    }
}
