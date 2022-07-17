package day06;

import java.util.Scanner;

public class Day06IfElseStatement02 {
    /*

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password");
        String pwd = scan.next();
        //Ask user to enter the password then check if the password is valid or not according to the given rules
        //1)At least 8 characters 2)Contains at least 1 uppercase #) Contains at least 1 lowercase 4) Contains at least 1 symbpol

        if(pwd.length()<8){
            System.out.println("Password is invalid because it does not have at least 8 characters");
        } else if((pwd.replaceAll("[^A-Z]","")).length()==0){
            //replace all characters that are different than Uppercase by "" That means remove it,
            // and then check if length is >0, it it is it means that
            //there is uppercase else it means that there isn't uppercase
            System.out.println("Password is invalid because it does not have at least one uppercase");
        } else if((pwd.replaceAll("[^a-z]","").length()==0)){
            System.out.println("Password is invalid because it does not have at least one lowercase");
        }else if((pwd.replaceAll("[^Aza-z0-9]","")).length()==0){
            System.out.println("Password is invalid because it does not have at least one symbol");
        }else{
            System.out.println("Password is valid, Welcome to Chase Bank");
        }
    }

}
