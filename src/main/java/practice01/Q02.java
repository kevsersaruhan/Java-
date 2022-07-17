package practice01;

import java.util.Scanner;

public class Q02 {
    /*
        Take a number from user and,
        1)Check if it is less than 0. If it s less than zero, print "Negative number" on console
        2) If it s greater than or equals to zero check if it s less than 10, if it s less than 10, print "Positive digit" on console
        and if it s greater than or equals to 10 print positive Number on console
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scan.nextInt();
        if(num<0){
            System.out.println("Negative number");
        }else if(num<10){
            System.out.println("Positive digit");
        }else System.out.println("Positive number");
    }
}
