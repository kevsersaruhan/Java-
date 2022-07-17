package practice09;

import java.util.Scanner;

public class Q02 {
    /*
            take the number of rows from user and print on console the shape based on rows.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i=0;i<num;i++){
            for(int j=num-i;j>1;j--){
                    System.out.print(" ");
                }

            for (int k=0;k<=i;k++){
                System.out.print("* ");
                }
            System.out.println();
        }


    }


}
