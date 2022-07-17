package day11;

import java.util.Scanner;

public class Day11WhileLoop02 {

    public static void main(String[] args) {
        //Type code to check if a given integer is polindrome or not
        //Palindrome: 121 <==> 121

        //Solution du prof
        int j =121;
        String iS=String.valueOf(j);
        int k = iS.length()-1;
        String reversed = "";
        while(k>0){
            reversed = reversed + iS.charAt(k);
            k--;
        }
        if(iS.equals(reversed)){
            System.out.println("Palindrome");
        }else System.out.println("Not Palindrome");

        System.out.println(reversed);
        //Ma solution
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scan.nextInt();
        String snum = String.valueOf(number);
        int i=0;
        int y=snum.length()-1;
        boolean test=false;
        while(i<snum.length()){
            if(snum.charAt(i)==snum.charAt(y)){
                test=true;
                i++;
                y--;
            }else {
                test=false;
                break;
            }

        }
        System.out.println(test==true?"Polidrome":"Not polidrome");
    }
}
