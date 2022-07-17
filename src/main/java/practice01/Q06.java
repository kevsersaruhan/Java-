package practice01;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {
        /*
            Ask user to enter a character and check if it is a letter
            If it is not a letter print "Not letter" on console.
            If it is letter check if it is lowercase or uppercase letter.
            If it is lowercase print "Lowercase letter", if it is uppercase letter orint "Uppercase letter" on console.
         */

        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);

        System.out.println(c>='A' && c<='Z'  ? "Uppercase" : c>='a' && c<='z'  ? "Lowercase" : "Not a letter");

    }
}
