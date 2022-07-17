package day15;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    /*
        1) Arrays are fixed in length which is not good but Lists are flexible in length which is good
        2) Arrays can store just primitives and references but Lists store non-primitives
        3) Arrays is faster than Lists
        4) Arrays use memory less than Lists

     */
    public static void main(String[] args) {
        //How to create a List (ArrayList)

        //General
        //1.Way: Mostly used
        List<Integer> al = new ArrayList<>();

        //Specific
        //2.Way: it is true to use
        ArrayList<Integer> bl = new ArrayList<>();

        //How to print a List on the console
        System.out.println(al);// [] ==> empty list

        //How to add elements into a List
        //add method puts the elements in insertion order
        al.add(12);
        al.add(21);
        al.add(5);
        System.out.println(al);//[12,21,5]

        al.add(2,99);
        al.add(88);
        System.out.println(al);//[12,21,99,5]

        //How to get the number of elements in a list
        //For lists to explain the number of elenmets use "size"
        int numOfEl = al.size();
        System.out.println(numOfEl);//5

        //How to get a specific element from a list by using index
        int el = al.get(3);
        System.out.println(el);

        //Create a list and add even integers between 13 51 in descending order
        List<Integer> cl = new ArrayList<>();
        for(int i=51; i>12;i--){
            if(i%2==0){
                cl.add(i);
            }
        }
        System.out.println(cl.get(6));

        //How to remove a specific element
        List<String> dl = new ArrayList<>();
        dl.add("A");
        dl.add("C");
        dl.add("B");
        dl.add("E");

        System.out.println(dl);//[A, C, B, E]

        dl.remove("C");
        System.out.println(dl);//[A, B, E]

        List<Integer> fl = new ArrayList<>();
        fl.add(12);
        fl.add(21);
        fl.add(32);
        fl.add(45);
        //Remove 21 from the list fl
        //1.Way: to remove a specific integer element from a list use indexOf() inside the remove()
        fl.remove(fl.indexOf(21));
        System.out.println(fl);//[12, 32, 45]

        //2.Way: To remove a specific int element from a list convert it to wrapper class
        fl.remove((Integer)32);
        System.out.println(fl);//[12, 45]

        //Create a String List add elements into it then remove the elements and end with "a" starts with "M"

        List<String> gl = new ArrayList<>();
        gl.add("Maria");
        gl.add("Mandalena");
        gl.add("Karenina");
        gl.add("Mexico");
        gl.add("Casablanca");

        for(int i=0; i<gl.size();i++){
            String element = gl.get(i);
            if(element.startsWith("M") && element.endsWith("a")){
                gl.remove(element);
                i--;//After removing any element Java decreases the indexes of remaining elements. That's why
                    //We are decreasing the value of "i"
            }
        }
        System.out.println(gl);



    }
}
