package practice04;

public class Q02 {
    /*
        Write a Java program to take the last 3 characters from a given string
        and add these three characters at both the front and back of the string

     */
    public static void main(String[] args) {
        String str="John Doe";
        String sub = str.substring(str.length()-3);
        System.out.println(sub+str+sub);


    }
}
