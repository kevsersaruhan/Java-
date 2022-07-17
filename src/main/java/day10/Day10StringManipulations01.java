package day10;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Day10StringManipulations01 {
//Note 1: Index of last charactger equald to length() -1 everytime
    public static void main(String[] args) {

        //Ask user to enter his full name, then create a unique id for the user
        //Id should contain first 2 characters of the first name and last 2 characters of the last name
        //Use the current date time at the end of the Id.
        //Example ; Tom Hanks ==> Toks20220528110434

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name...");
        String name = input.nextLine();

        String first = name.substring(0,2);
        String lastTwo = name.substring(name.length()-2);

        String currentDateTime = LocalDateTime.now().toString().substring(0,19).replaceAll("[^0-9]","");
        // On aurait pu mettre \\D pour dire tout ce qui n est pas des digits on remplace par rien ""

        String id = first+lastTwo+currentDateTime;
        System.out.println(id);

    }
}
