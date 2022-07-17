package day11;

import java.util.Scanner;

public class Day11WhileLoop03 {
    public static void main(String[] args) {
        //Type code to print the sum of the digit of an integer

        int i = 12345;
        int sum = 0;

        while(i>0){
            sum=sum+(i%10);
            i/=10;
        }
        System.out.println(sum);

        //type code to create a multiplication table for any given number

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scan.nextInt();
        int j=0;
        while(j<11){
            System.out.print(num+" * "+j+" = "+num*j+"\t");
            j++;
        }

    }
}
