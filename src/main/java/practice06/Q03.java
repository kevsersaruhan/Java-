package practice06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {
    /*
    Type code to ask user to enter the int elements and add elements into the list
    Ask user to enter the elements to remove, then remove that element from list.
    Ask user to enter the element to update, then update it.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 integers: ");
        List<Integer> list = new ArrayList<Integer>();
        list.add(scan.nextInt());
        list.add(scan.nextInt());
        list.add(scan.nextInt());
        list.add(scan.nextInt());
        list.add(scan.nextInt());
        System.out.println(list);
        System.out.println("Enter the element to remove: ");
        list.remove(list.indexOf(scan.nextInt()));
        System.out.println(list);
        System.out.println("Which element do you want to update?: ");
        int elementToUpdate= scan.nextInt();
        System.out.println("What is the new value? ");

        list.set(list.indexOf(elementToUpdate),scan.nextInt());
        System.out.println(list);

    }
}
