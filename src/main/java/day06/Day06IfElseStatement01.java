package day06;

import java.util.Scanner;

public class Day06IfElseStatement01 {
    /*
        If the score is less than 50 you will fail
        If the score is greater than or equal to 50 then you will pass

        If the score is less than 50 you will fail otherwise you will pass
     */
    public static void main(String[] args) {
        //Ask user to enter the score, if the score is less than 50 print "fail" otherwise print "pass" on the console.
        //1.Way : Recommended
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scan.nextInt();

        if(score<50){
            System.out.println("fail");

        }else{
            System.out.println("Pass");

        }

        //2.Way : Multiple if, not recommended

        if(score<50){
            System.out.println("Fail");
        }
        if(score>=50){
            System.out.println("Pass");
        }

        //ASk user to enter the number of day, then print the name of the day whose number was given
        //Example:2 ==> Monday, 5 ==> Thursday

        System.out.println("Please day number: ");
        int dayNum = scan.nextInt();
        if(dayNum==1){
            System.out.println("Sunday");
        }else if(dayNum==2){
            System.out.println("Monday");
        }else if(dayNum==3){
            System.out.println("Tuesday");
        }else if(dayNum==4){
            System.out.println("Wednesday");
        }else if(dayNum==5){
            System.out.println("Thursday");
        }else if(dayNum==6){
            System.out.println("Friday");
        }else if(dayNum==7){
            System.out.println("Saturday");
        }else System.out.println("Please enter a valid day number");
    }
}
