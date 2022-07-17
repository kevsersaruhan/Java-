package day10;

import java.util.Scanner;

public class Day10ForLoop02 {
    public static void main(String[] args) {

        //interview question
        //Type code to reverse a String
        //Tom Hanks ==> sknah omT

        String s = "Tommy";
        String reversed ="";

        for (int i =s.length()-1;i>=0;i--){
            reversed = reversed+ s.charAt(i);
        }
        System.out.println(reversed);

        //Type code to find the sum of the digits of an integer
        //2543 ==> 14
        Scanner scan = new Scanner(System.in);
        int num = Math.abs(scan.nextInt());

        int sumOfDigits = 0;
        for (int i=num;i>0;i=i/10){
            sumOfDigits=sumOfDigits+i%10;
        }
        System.out.println(sumOfDigits);//12
    }
}
