package practice01;

import java.util.Scanner;

public class Q04 {
    //Type a code to calculate the hypotenuse.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the first leg of the right triangle:  ");
        double a = scan.nextDouble();
        System.out.println("Please enter the length of the second leg of the right triangle:  ");
        double b = scan.nextDouble();

        double hipo =Math.sqrt(a*a+ b*b);
        System.out.println(hipo);

    }
}
