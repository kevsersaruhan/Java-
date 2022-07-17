package day12;

import java.util.Arrays;

public class Day12Arrays01 {
    public static void main(String[] args) {
        /*
            1) Arrays are for storing multiple data
            2)An array can have just a single data type
            3)Arrays can store just primitive data types or references of non-primitives.
              An array cannot have non-primitive data types in it.
            4)When you create an array you have to declare its length(Number of elements in an array)
         */


        //How to create an Array
        int ages[] = new int[4];

        //How to print an array on the console
        System.out.println(Arrays.toString(ages)); // [0, 0, 0, 0]
        //How to assign values to array elements
        ages[0] = 12;
        ages[1] = 20;
        ages[2] = 11;
        ages[3] = 9;

        System.out.println(Arrays.toString(ages));// [12, 20, 11, 9]

        //How to print array elements one by one
        System.out.println(ages[2]);//11

        //Print the sum of the ages array elements on the console
        //1.Way
        System.out.println(ages[0] + ages[1] + ages[2] + ages[3]);//52
        //2.Way
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }
        System.out.println(sum);

        //How to create an array and assign values in short way
        String names[] = {"Tom", "Jim", "Alex", "Karl"};
        System.out.println(Arrays.toString(names));//[Tom, Jim, Alex, Karl]

        //Find the total number of characters in array elements
        int total = 0;
        for (int i = 0; i < names.length; i++) {
            total += names[i].length();
        }
        System.out.println(total);//14
    }

}
