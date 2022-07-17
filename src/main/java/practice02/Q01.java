package practice02;

import java.util.Locale;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //Ask user to enter first name, middle name and last name as one single String, then print the first
        //e.g. Mark Hansel Twain ==> HT
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name, middle name and last name: ");
        String str=scan.nextLine().trim().toUpperCase();
        char initialOfMiddleName =str.charAt(str.indexOf(" ")+1);
        char initialOfLastName = str.charAt(str.lastIndexOf(" ")+1);
        System.out.print(initialOfMiddleName+initialOfLastName);
    }
}
