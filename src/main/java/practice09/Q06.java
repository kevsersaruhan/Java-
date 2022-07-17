package practice09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Q06 {
    /*
        Create a method to add 10 random integers form 0 to 20 into a List. Convert even numbers to 111.
        If there is no even number print on console "There is no even number"
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int counter = 0;
        Random rand = new Random();
        int random_int;

        for (int i=0;i<10;i++){
            random_int = rand.nextInt(20);
            list.add(random_int);
        }
        System.out.println(list);
        for(Integer i :list){
            if(i%2 == 0){
                list.set(list.indexOf(i),111);
                counter++;
            }
        }
        System.out.println(list);
        if(counter==0){
            System.out.println("There isn't any even number.");
        }
    }
}
