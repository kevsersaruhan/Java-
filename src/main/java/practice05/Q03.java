package practice05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Q03 {
    /*
        Create a method to ask user to enter two strings and check them if they are "Anagram"

        ===Interview Question===
        *Anagram is to create a new word from other word's characters.
        *Write java code to check if two words are anagram or not
        *isAnagram("listen","silent") ==> anagram
        *Dormitory = Dirty room
        *School master = The classroom
        *Conversation = Voices rant on
        *Silent = Listen
        *Astronomer = Moon Starer
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first String");
        String first = input.nextLine();
        System.out.println("Enter second String");
        String second = input.nextLine();

        System.out.println(isAnagram(first,second));
        isAnagramm(first,second);
    }

    public static boolean isAnagram (String str1, String str2){
        String[] string1 = str1.trim().toLowerCase().replaceAll(" ","").split("");
        String[] string2 = str2.trim().toLowerCase().replaceAll(" ","").split("");
        Arrays.sort(string1);
        Arrays.sort(string2);
        boolean isEqual = true ;
        if(string2.length != string1.length){
            return isEqual=false;
        }else{

            for (int i = 0; i<string1.length;i++){
                if(!string2[i].equals(string1[i])){
                    isEqual = false;
                    break;
                } else{
                    isEqual = true;
                }
            }

        }
        return isEqual;
    }

    public static void isAnagramm (String str1, String str2) {
        String[] string1 = str1.trim().toLowerCase().replaceAll(" ", "").split("");
        String[] string2 = str2.trim().toLowerCase().replaceAll(" ", "").split("");
        Arrays.sort(string1);
        Arrays.sort(string2);
        boolean isEqual = true;
        if (Arrays.equals(string1, string2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("NOT Anagram");
        }
    }
}
