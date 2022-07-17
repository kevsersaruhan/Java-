package day12;

import java.util.Scanner;

public class Day12DoWhileLoop01 {
    public static void main(String[] args) {
        /*
            Ask user to enter an integer.
            If tje integer is less than 100, tell user "Won!"
            Otherwise, tell user "Lost!"
         */

        //1.Way
        Scanner input = new Scanner(System.in);
        int i=0;
        do {
            System.out.println("Enter an integer");
            i = input.nextInt();
            if(i<100) System.out.println("Won!");
        }while(i<100);

        System.out.println("Lost!");

        //2.Way

        int k = 0;
        do{
            System.out.println("enter an integer");
            k=input.nextInt();
            if(k>=100){
                System.out.println("Lost");
                break;
            }
            System.out.println("Won!");
        }while(true);
    }
}
