package day04;

import java.util.Scanner;

public class Day04Scanner03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width of the rectangular prism");
        double width = input.nextDouble();
        System.out.println("Enter the length of the rectangular prism");
        double length = input.nextDouble();
        System.out.println("Enter the height of the rectangular prism");
        double height = input.nextDouble();

        System.out.println(width*length*height);


    }
}
