package day06;

public class Day06NestedTernary {

    public static void main(String[] args) {

        /*
            Type Java code using nested ternary.
            Write a program to check if a year is leap year or not.
            If the year is divisible by 100 then it must be divisible by 400.
            If a year is not divisible by 100 it must be divisible by 4.
         */


        int year = 1453;

        String result = year%100==0 ? (year%400==0? "Leap year": "Not leap year"): (year%4==0? "Leap year": "Not Leap year");

        System.out.println(result);

        //What if turnery returns different data types?
        String s = "Tom Hanks";

        //If you have different data types in ternary, to see outputs on the console you can put ther ternary directly inside the sout
        System.out.println(s.startsWith("T") ? s.length() : String.valueOf(s.charAt(0)));

        //startWith() method checks the initial in the String
        //if it starts with the expected character it returns true otherwise it returns false
        //length returns int
        //charAt(0) => 0 means first character, character place number, index
        //charAt(0) returns a character => here it returns T
        //We use String.valueOf to have the value of the character otherwise it returns ascii value
        //when the data types are different you can put it inside sout

        String result2=s.startsWith("K") ? String.valueOf(s.length()) : String.valueOf(s.charAt(0));
        System.out.println(result2);


    }
}
