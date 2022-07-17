package practice03;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*
            Type code to ask user to enter an integer to check if it is 'Perfect Number' or not.
            A perfect number is a positive integer that is equal to the sum of all its proper divisors.
            6 = 1+2+3, 28 = 1+2+4+7+14, (496 and 8128)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scan.nextInt();
        int counter = 0;
        /*
        int i=1;

        while(i<num){
            if(num%i==0){
                counter+=i;
            }
            i++;
        }

        */
        for(int i=1;i<num;i++){
            if(num%i==0){
                counter+=i;
            }
        }
        if(counter==num){
            System.out.println(num+" is a perfect number");
        }else{
            System.out.println(num+" Is not a perfect number");
        }

    }
}
