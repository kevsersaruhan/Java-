package day10;

import java.util.Scanner;

public class Day10ForLoop03 {
    public static void main(String[] args) {
        //Type code to print unique characters in a String
        //Example: Alabama ==> Albm

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to see unique characters: ");
        String uniques= input.nextLine();

        for(int i = 0;i<uniques.length();i++){
           char c = uniques.charAt(i);
           if(uniques.indexOf(c)==uniques.lastIndexOf(c)){
               System.out.println(c);
           }
        }

        //Type code to print the following image on the console
        /*
                    X X X X X
                    X X X X X
                    X X X X X
         */

        System.out.println("Enter number of columns and rows: ");
        Scanner scan = new Scanner(System.in);
        int columns = scan.nextInt();
        int rows = scan.nextInt();

        for(int i=0;i<rows;i++){
            String s="";
            for(int y=0; y<columns;y++){
               s=s+"X ";
            }
            System.out.println(s);
        }
        for(int i=0;i<rows;i++){
            for(int y=0; y<columns;y++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
