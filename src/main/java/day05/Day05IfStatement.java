package day05;

import java.util.Scanner;

public class Day05IfStatement {

    /*
        If your score is less than 50 then you will fail
         if(Condition){
                <The code to be executed if the condition is true>

            }
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n =input.nextInt();

        //Type the code to check if the integer got from user is diveded by 3 or not
            if(n%3!=0){
                System.out.println("The number is not divided by 3");
            }

            if(n%3 ==0){
                System.out.println("The number is divided by 3");
            }

            //Type code to check if the first digit of a 3 digits integer is less than 5.
            //If it is less than 5 print 'perfect number' otherwise print 'good number'

        System.out.println("Please enter a 3 digit integer");
            int res = input.nextInt();

        if((res/100)<5){
            System.out.println("It is perfect number");
        }

        if(res/100>5) {
            System.out.println("it is a good number");
        }

        //Ask user to enter the initial of the day names then print the day names on the console
        System.out.println("Please enter the initial of any day: ");
        String answer = input.next();

        if(answer.equals("S")){
            System.out.println("Saturday & Sunday ");
        }
        if(answer.equals("T")){
            System.out.println("Thuesday & Thursday");
        }
        if(answer.equals("W")){
            System.out.println("Wednesday");
        }
        if (answer.equals("F")){
            System.out.println("Friday");
        }
        if(answer.equals("M")){
            System.out.println("Monday");
        }
    }
}
