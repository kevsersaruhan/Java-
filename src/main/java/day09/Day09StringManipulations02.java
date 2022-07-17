package day09;

import java.util.Scanner;

public class Day09StringManipulations02 {

    public static void main(String[] args) {
        /*
            Check if a password has the following conditions
            1) It should not be empty
            2) It should not be just a single space
            3) It should not have spaces at the beginning and at the end
            4) 'i' should be a character in the password and first occurence of 'i' should be at index 4
            5) 'K' should be a character on the password and last occurence of 'K' should be at index 5
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String pswd = scan.nextLine();

        //isEmpty() method checks the String if it is empty or not.
        //If the String is empty it will return true, otherwise it will return false
        if(!pswd.isEmpty()){
            System.out.println("Your password is not empty! ");
        }else {
            System.out.println("Password shouldn't be empty");
        }
        //Returns true if the string is empty or contains only white space codepoints, otherwise false
        if(!pswd.isBlank()){
            System.out.println("Password is not space");
        } else {
            System.out.println("Password shouldn't be space");
        }

        if(pswd.length()==pswd.trim().length()){
            System.out.println("Password has no space at the beginning and at the end");
        }else {
            System.out.println("Password shouldn't have space at the beginning and at the end");
        }

        if(pswd.indexOf("i")==4){
            System.out.println("Password has i at index 4");
        }else {
            System.out.println("Password should have 'i' at index 4");
        }
        if(pswd.lastIndexOf("K")==4){
            System.out.println("Password has K at index 5");
        }else {
            System.out.println("Password is invalid");
        }
    }
}
