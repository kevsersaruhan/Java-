package day26;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    /*
        1) "FIFO" means "First in First Out" if you need a functionality contains "FIFO" prefer to use "Queue"

     */
    public static void main(String[] args) {

        Queue<String> q1 = new LinkedList<>();
        q1.add("Rick");
        q1.add("Maggie");
        q1.add("Glenn");
        q1.add("Megan");
        q1.add("Daryl");

        Queue<String> q2 = new LinkedList<>();
        System.out.println(q1);//[Rick, Maggie, Glenn, Megan, Daryl]

        //copy paste the first element but doesn't remove the head of this queue
        //if this queue is empty, it throws NoSuchElementException
        System.out.println(q1.element());//Rick
        //System.out.println(q2.element);//throws NoSuchElementException

        //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
        System.out.println(q1.peek());//Rick
        System.out.println(q2.peek());//null

        //Insert the specified element into this queue if it is possible to do so immediately
        //without violating capacity restrictions.
        //When using a capacity-restricted queue, this method is generally preferable to add,
        //which can fail to inster an element only by throwing an exception

        q1.offer("XXXXX");
        System.out.println(q1);

        //Retrieves and removes the head of this queue, or returns null if this queue is empty
        System.out.println(q1.poll()); //Rick
        System.out.println(q1);//[Maggie, Glenn, Megan, Daryl, XXXXX]

        //When you use PriorityQueue<>() constructor to create Queue, it is possible to create sorting logic
        Queue<String> q3 = new PriorityQueue<>();
        q3.add("Rick");
        q3.add("Maggie");
        q3.add("Glenn");
        q3.add("Megan");
        q3.add("Daryl");
        System.out.println(q3);//[Daryl, Glenn, Maggie, Rick, Megan]



    }
}
