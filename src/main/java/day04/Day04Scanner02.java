package day04;

import java.util.Scanner;
public class Day04Scanner02 {
    /*
    ASk user to enter the width and the length of a rectangle and print the area and the parameter on the console
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the width: ");
        double width = scan.nextDouble();
        System.out.println("Please enter the length: ");
        double length = scan.nextDouble();
        System.out.println("The area of the rectangle is "+width+" * "+length+" = "+width*length);
        System.out.println("The parameter of the rectangle is ("+width+" + "+length+")*2 = "+(width*length)*2);
    }
}
