package day10;

import java.util.Scanner;

public class Day10ForLoop04 {
    public static void main(String[] args) {
        /*
            Week 1:
                Day 1:
                Day 2:
                Day 3:
                Day 4:
                Day 5:
                Day 6:
                Day 7:

            Week 2:
                Day 1:
                Day 2:
                Day 3:
                Day 4:
                Day 5:
                Day 6:
                Day 7:
         */

        System.out.println("How much week do you want to organize? ");
        Scanner scan = new Scanner(System.in);
        int numOfWeek= scan.nextInt();

        for(int i=0;i<numOfWeek;i++){
            System.out.println("Week "+i+":");
            for (int y=0;y<7;y++){
                System.out.println("\tDay "+y+":");
            }
        }
    }
}
