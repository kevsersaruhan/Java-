package practice09;

import java.util.Scanner;

public class Q01 {
    //Ask user to enter 2 chars and print on console the chars between them.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char char1 = scan.next().charAt(0);
        char char2 = scan.next().charAt(0);

        for(int i=char1+1;i<char2;i++){
            System.out.println((char)i+" ");
        }
    }
}
