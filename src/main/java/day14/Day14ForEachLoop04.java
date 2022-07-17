package day14;

import java.util.Arrays;
import java.util.Comparator;

public class Day14ForEachLoop04 {
    public static void main(String[] args) {
        //Find the longest word in a String
        String sentence = "Java is easy if you study. Actually nothing is easy if you do not study.";

        //Remove the punctuation
        //Put every word into an array ==>[Java, is, easy, if, you, study., Actually, nothing, is, easy, if, you, do, not, study.]
        //Sort the array elements according to the lengths ==>[is, is, if, if, do, you, you, not, Java, easy, easy, study, study, nothing, Actually]
        //Last element will be the longest one

        String sentenceWithoutPunctuation = sentence.replaceAll("\\p{Punct}","");

        String words[] = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
        System.out.println(words[0]);//Actually

        //How to see all the longest elements if there are many
        for(String w: words){
            if(w.length()==words[0].length()){
                if(w.length()==words[0].length()){
                    System.out.println(w+" ");
                }
            }
        }
    }
}
