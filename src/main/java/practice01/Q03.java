package practice01;

import java.util.Scanner;

public class Q03 {
    /*
        Write a Java program to break an integer into a sequence of individual digits.
        hint: use / and %
        x: input 12345
        output: 1
                2
                3
                4
                5

     */
    public static void main(String[] args) {

        System.out.println("Please enter a digit: ");
        int x= 12345;
        int ones= x%10;
        int tens=(x/100)%10;
        int hondreds=(x/1000)%10;
        int thousends =(x/10000)%10;
        int tenThousends=(x/100000)%10;
        System.out.println(tenThousends+"\n"+thousends+"\n"+hondreds+"\n"+tens+"\n"+ones);
    }
}
