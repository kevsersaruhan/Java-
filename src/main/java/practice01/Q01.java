package practice01;

import java.util.Scanner;

public class Q01 {

    /*
        Ask user to enter his/her first name, last name, age, height and weight then print them on console in this way
            First Name: ...
            Last Name: ...
            Age: ...
            Height: ...
            Weight: ...
        Note: Use only one "System.out.println();"
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("First Name: ");
        String firstName = scan.next();
        System.out.println("Last Name: ");
        String lastName = scan.next();
        System.out.println("Age: ");
        int age= scan.nextInt();
        System.out.println("Height: ");
        double height = scan.nextDouble();
        System.out.println("Weight: ");
        double weight = scan.nextDouble();

        System.out.println("First Name : "+firstName+"\nLast Name: "+firstName+"\nAge: "+age+"\nHeight: "+height+"\nWeight: "+weight);

    }
}
