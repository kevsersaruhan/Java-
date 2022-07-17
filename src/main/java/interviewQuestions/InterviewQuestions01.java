package interviewQuestions;

import java.util.Scanner;

public class InterviewQuestions01 {

    /*
        Ask user to enter 2 numbers then swap tje,
        //a=12 and b=13 ==> a=13 and b=12
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = scan.nextDouble(); //12

        System.out.println("Enter second number: ");
        double b = scan.nextDouble();//13
        System.out.println(a+" - "+b);//12 - 13

        //1.Way
        double temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+" - "+b);//13 - 12

        //2.Way
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" - "+b);
    }
}
