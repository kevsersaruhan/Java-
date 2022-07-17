package practice06;

import java.util.Arrays;
import java.util.List;

public class Q05 {

    /*
        If the list has 15 elements, change all 15s to 51
        Example: (12,11,15,34,43) ==> Output is (12,11,51,34,43)
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,11,15,34,43);
        System.out.println(list);
        if(list.contains(15)){
            for (Integer i : list) {
                if(i==15){
                    list.set(list.indexOf(i), 51);
                }

            }
            System.out.println(list);
        }else{
            System.out.println("List doesn't contain the expected element");
        }

    }
}
