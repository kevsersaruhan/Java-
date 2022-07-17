package practice02;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*
            A company decided to give bonus of 5% of salary to employee if his/her year of service is 5 and more than 5 years.
            Ask user for their salary and year of service and print the net bonus amount.
            If employee can not get bonus, print how many more years he/she should work.

            Example:
            Input : Year => 4 years service
                    Salary => 4000

            Output: You need to work 1 year(s) to get bonus
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your year of service: ");
        int year = scan.nextInt();
        System.out.println("Enter your salary");
        double salary = scan.nextDouble();

        if(year>=5){
            System.out.println("Your new salary is : "+salary*1.05);
        }else{
            System.out.println("You need to work "+(5-year)+" more year/s");
        }

    }
}
