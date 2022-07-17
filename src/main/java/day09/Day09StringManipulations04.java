package day09;

public class Day09StringManipulations04 {

    public static void main(String[] args) {
        //Type a code to find number of ponctuation marks used in a String.

        String str = "Wow!... Ali is 13 years old, and he is a university student.";
        int numberOfChar = str.length();

        String strWithoutPunctuationMarks = str.replaceAll("\\p{Punct}","");
        int totalNumOfCharsWithoutPunctuation = strWithoutPunctuationMarks.length();

        System.out.println(numberOfChar-totalNumOfCharsWithoutPunctuation);

        //Create a method prints greetings by using the given name
        //Ali => Hi Ali     Tom => Hi Tom

        String name = "Kevser";
        System.out.println(greetUser(name));

        //Create a method makes the decimal part has 5 digitds
        System.out.println(limitDecimalPart(12.21f));
    }
    public static String greetUser(String name){
        return String.format("Hi %s",name);
    }

    public static String  limitDecimalPart(float number){
        return String.format("The price is %.5f");
    }

}
