package day12;

import java.util.Scanner;

public class Day12DoWhileLoop02 {
    public static void main(String[] args) {
        /*
            Username is "admin", Password is "pwd123"
            Ask user to enter username and password
            User should see "Enter your username and password" message
            If user enters correct credentials, he should get "You are in your account!" message
            Otherwise, he should see "Enter your username and password" message 3 times
            After 3 times he should get "Your account is blocked" message
        */

        Scanner input = new Scanner (System.in);
        int count = 0;
        String username = "admin";
        String pwd ="pwd123";


        do{
            System.out.println("Please enter your username and password: ");
            String entry =input.nextLine();
            String usernameEntry = entry.split(" ")[0];
            String pwdEntry = entry.split(" ")[1];
            if(usernameEntry.equals(username)&&pwdEntry.equals(pwd)){
                System.out.println("You are in your account!");
                break;
            }else{
                count++;
            }
        }while(count<3);
        if(count==3) System.out.println("Your account is blocked");

        //Prof

        int counter =0;
        do{
            if(counter==3){
                System.out.println("Your account is blocked");
                break;
            }
            System.out.println("Enter username");
            String user = input.next();
            System.out.println("Enter your password");
            String pass = input.next();

            counter ++;
            if(user.equals("admin") && pass.equals("pwd123")){
                System.out.println("You are in your account!");
                break;
            }

        }while(true);

    }
}
