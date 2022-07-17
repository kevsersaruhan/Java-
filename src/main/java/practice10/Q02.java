package practice10;

import java.util.Scanner;

public class Q02 {
    /*
        Ask user to enter a number and print on console number ny matrix.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num=input.nextInt();

        for(int i=0; i<num; i++){
            for(int j=0;j<num;j++){
                System.out.print((int)(Math.random()*2)+" ");
            }
            System.out.println();
        }
    }


}
