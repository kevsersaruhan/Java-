package day07;

import java.util.Scanner;

public class Day07Switch03 {
    public static void main(String[] args) {
        //Ask user to enter a character, if it s vowel letter on console,
        //if it s not vowel print "Not vowel", If it s not letter print "Enter a letter"

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a letter to check if it s vowel or not");
        char c =input.next().toLowerCase().charAt(0);

        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
                System.out.println("Not Vowel");
                break;
            default:
                System.out.println("Enter a letter");
        }
    }
}
