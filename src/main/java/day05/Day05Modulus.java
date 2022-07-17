package day05;

import java.util.Scanner;

public class Day05Modulus {

    /*
        Modulus Operator: % is called modulus operator in Java
        It returns the remainder in a division operation
        13%5==>3
     */
    public static void main(String[] args) {

        System.out.println(13%5);//3

        //Ask user to enter an integer to print the last digit of the integer on the console

        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer");
        int number = input.nextInt();
        int absN=Math.abs(number); // permet d avoir la valeur absolue du nombre pour eviter les soucis
        System.out.println(absN);
        int lastDigit = absN%10; // on utilise la valeur absolue pour que dans chaque cas soit ok

        System.out.println(lastDigit);

        //ASk user to enter his/her birth year, then print just last 2 digits on the console

        int lastTwoDigits = absN%100;
        System.out.println(lastTwoDigits);

        //Ask user to enter an integer then check if the number is even. //divisible par 2
        System.out.println("Is the number even? "+(absN%2==0));

        //Ask user to enter an integer then check if the number is odd.
        System.out.println("Is the number odd? "+(absN%2!=0));

        //Ask user to enter a 3 digits integer to find the sum of the digits.
        int last = absN%10; // absN = 237 last = 7
        absN=absN/10; //absN = 23
        int second = absN%10; //second = 3
        absN=absN/10;// absN=2
        int first = absN%10; // first = 2

        System.out.println(first+second+last);//12







    }
}
