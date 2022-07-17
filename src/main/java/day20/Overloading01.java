package day20;

public class Overloading01 {
    /*
        Polymorphism = overloading + Overriding
        1) We need methods with the "same name" and "different parameters" to make our codes more readable
        This is "method overloading"

        2)How can you make the parameters different?
            i)By chanding the number of parameters
            ==> public static int add(int a, int b){} and  public static int add(int a, int b, int c){}
           ii)By changing data types of the parameters
             ==> public static int add(int a, int b){} and  public static double add(double a, double b){}
          iii)By changing the order if the data types are different
           ==> public static int add(int a, String b){} and  public static int add(String a, int b){}

        3)Can you overload "private" method
            Method Overloading is done in a single class, "private" access modifier creates issue if you are
            outside the class. Therefore, doing method overloading will not be problem for private methods.
        4)Can you overload "static" methods?
          "static" methods can be overloaded.
        5)Method OVerloading is a part of the "Polymorphism"


     */

    public static void main(String[] args) {
        String s = "Java";

    }

    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static double add(double a,double b){
        return a+b;
    }

    public static String add(String a,int b){
        return a+b;
    }

    public static String add(int a,String b){
        return a+b;
    }
}
