package day13;

import java.util.Arrays;
import java.util.Scanner;

public class Day13Arrays02 {
    public static void main(String[] args) {
        /*
            Create a String array by getting elements from user
            Type code to put elements in alphabetical order
            Type code to print the total number of characters in the first and the last String
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int el = input.nextInt();
        String table[] = new String[el];
        int i=0;

        do{
            System.out.println("Enter element "+(i+1)+" : ");
            table[i]=input.next().toLowerCase();
            i++;
        }while (i<el);

        Arrays.sort(table);
        System.out.println(Arrays.toString(table));
        System.out.println(table[0].length()+" "+table[table.length-1].length());
    }
}
