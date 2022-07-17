package practice04;

import java.util.Scanner;

public class Q04 {
    /*
        type code to ask user to enter the number of row
        and print the shape below according to that number:

        1
        2 3
        4 5 6
        7 8 9 10

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of row");
        int num = scan.nextInt();
        int counter = 1;
        for(int i=0; i<num;i++){
            for(int j=0; j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }

    }


}
