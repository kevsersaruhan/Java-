package day26;

import com.sun.source.tree.Tree;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet02 {
    /*
        Question: What do you do to store unique elements in natural order?
                  I use TreeSet
        Question: As you know TreeSet is so slow in adding and removing elements, what do you do to make it fast?
                  i) Create a HashSet
                  ii)Add the elements into HashSet
                  iii)Convert HashSet to TreeSet


     */

    public static void main(String[] args) {

        //1.Way
        int time1 = LocalTime.now().getNano();
        HashSet<String> hSet = new HashSet<>();
        hSet.add("A");
        hSet.add("C");
        hSet.add("B");
        hSet.add("T");
        hSet.add("M");
        TreeSet<String> tSet = new TreeSet<>(hSet);
        int time2 = LocalTime.now().getNano();

        //2.Way
        TreeSet<String> tSet2 = new TreeSet<>();
        tSet.add("A");
        tSet.add("C");
        tSet.add("B");
        tSet.add("T");
        tSet.add("M");
        int time3 = LocalTime.now().getNano();
        System.out.println("HashSet + TreeSet: "+(time2-time1));
        System.out.println("TreeSet: "+(time3-time2));


    }

}
