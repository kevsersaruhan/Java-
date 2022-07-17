package day05;

public class Day05Concatenation {

    /*
    Concatenation : joining Strings with each other or with other data types
                    To do concatenation we have 2 options:
                        1) Use '+' sign
                        2) Use 'concat()' method ==> inside the concat method parenthesis you can put only String.
     */

    public static void main(String[] args) {
        String t="Tom";
        String h="Hanks";
        int i=12;
        int k=5;
        char c='A';

        System.out.println(t+" "+h);//Tom Hanks
        System.out.println(t.concat(" ").concat(h));
        System.out.println(t+i+k);//Tom125
        System.out.println(t+(i+k));//Tom17
        System.out.println((i+k+t));//17Tom
        System.out.println(i+t+k);//12Tom5
        System.out.println(t+i*k);//Tom60
        System.out.println(i+c+t);//77Tom
        System.out.println(c+t+k);//ATom5

    }
}
