package practice10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01 {
    /*
        A list has elements "M", "K" and "P"
        Ask user to enter a letter
        If the letter exists int list convert it to "Got it"
        otherwise add it to the list.

     */
    public static void main(String[] args) {

        List<Character> list = new ArrayList<>();
        list.add('M');
        list.add('K');
        list.add('P');

        Scanner scan = new Scanner(System.in);
        char letter = scan.next().charAt(0);

        if(list.contains(letter)){
            System.out.println("Got it!");
        }else list.add(letter);
        System.out.println(list);
    }
}
