package day20.day25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        List<String> list = new ArrayList<>();

        list.add("X");
        list.add("Y");

        //adding operation in LinkedList
        linked.add("A");
        linked.add(0,"Bubble");
        linked.addAll(list); //addAll with 1 parameter put the element in the end of the current list

        linked.addAll(1, list); // adAll with index and list insert the list at the given index
        linked.addFirst("K"); //insert in the beginning of the list
        linked.addLast("V"); // add at the end of the list
        System.out.println("Before removing:"+linked);
        //remove operation in the LinkedList
        System.out.println(linked.remove()); // first node will be removed, and returns it tou you, it will show the element it removed
        System.out.println(linked.remove("X")); //Will remove the first occurence of the specified element from this list, return a boolean
        System.out.println(linked.remove(3));//Removes the element at the specified position in this list, it will return the element
        //removeFirst() and remove() without parameter are the same but if you want to remove the first it s better to use removeFirst
        //same thing for removeLast()
        // linked.removeAll(list); //Removes all of this collections elements that are also contained in the specified collection.
        linked.removeIf(t->t.length()<2);

        //linked.clear();//Removes all the elements, makes list empty
        //System.out.println(linked.element());//Retrieves but does not remove the head (first element) of this list list.==>copy+paste
                         //NoSuchelementException - if this list is empty
        System.out.println(linked.peek());//Retrieves but does not remove the head (first element) of this list list.==>copy+paste
                            //null if the list is empty

        linked.poll();//Retrieves and removes the first element ==> cut+paste
                      //If the list is empty it will give us null

        //Find the method Retrieves and removes the first element, returns error for the empty linked list


        System.out.println("After the removing:"+linked);

    }

}
