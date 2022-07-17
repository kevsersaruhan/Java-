package day04;

import java.util.Scanner;

public class Day04Scanner04 {

    /*
        Get first name and last name from user then print them in upper cases on the console with a space between them
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your firstname:");
        String firstName = scan.next();

        System.out.println("Please enter your lastname:");
        String lastName =scan.next();

        System.out.println(firstName.toUpperCase()+" "+lastName.toUpperCase());

    }
}
