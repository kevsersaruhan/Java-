package practice02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*
            Ask user to enter two words. If the number of characters of the first word is even, then put the second word into the
            middle of the first word.
            If the number of characters of second word is odd, then print on console " you can not put second word into the middle of the first
            word".
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = scan.next();
        System.out.println("Enter second word: ");
        String word2 = scan.next();

        if(word1.length()%2==0){
            word1=word1.substring(0,word1.length()/2)+word2+ word1.substring(word1.length()/2,word1.length());
            System.out.println(word1);
        }else{
            System.out.println("You can't put the second word into the first one");
        }

    }
}
