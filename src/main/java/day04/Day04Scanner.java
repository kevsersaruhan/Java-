package day04;

import java.util.Scanner;

public class Day04Scanner {

    /*
        Scanner class is used to interact with user.
        To interact with user by using Scanner Class follow the steps

        1)Create a Scanner Class object
        2)Give a message to the user
        3)Put the data coming from user into memory

     */
    public static void main(String[] args) {
        //Create a Scanner Class Object
        Scanner input = new Scanner(System.in);

        //Give a message to the user
        System.out.println("Enter your age:");

        //Put the data coming from user into memory
        int age = input.nextInt(); // On recupere le record
        System.out.println(age);

    }
}
