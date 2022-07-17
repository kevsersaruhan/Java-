package day03;

import java.util.Locale;

public class Day03DataTypes {

    /*
    * Type casting: Converting a number primitive data to another number primitive data type. (cannot convert a char or boolean)
    * byte - short - int - long - float - double (smallest to largest)
    * Note 1: if you convert small data type to large data type it s called "Auto Widening"
    * Note 2: If you convert large data type to small data type it s called "Explicit Narrowing"
    *
    * Wrapper Class: Wrapper classes are classes for primitive data types
    *   Primitive     Wrapper Class
    *   byte          Byte
    *   short         Short
    *   int           Integer
    *   long          Long
    *   float         Float
    *   double        Double
    *   char          Character
    *   boolean       Boolean
    *
    * Memory Usage in Java
    * There are 2 types of memories in Java
    * 1) Stack Memory ==> Small memory
    * 2)Heap Memory ==> Huge Memory
    *
    *
    *
    * */

    public static void main(String[] args) {

        //Auto Widening (on met les petits box dans les grands, c est acceptable ca se fait automatiquement)
        byte age = 12;
        int myAge = age;

        //Auto Widening
        short populationOfAVillage = 21000;
        double myPopulationOfAVillage= populationOfAVillage;
        //on sait mettre les petits dans les grands

        //Explicit Narrowing (on met des grand box dans les petits, il faut forcer)
        double x= 23.45;
        long y=(long)x; // long is smallest than double, so java insist to put it to long container

        //Non primitive data types exemple.
        //Dans les types non primitives on a des méthodes.
        String name = "Mark Twain";
        System.out.println(name.toUpperCase()); //MARK TWAIN
        System.out.println(name.toLowerCase()); //mark twain

        //Find the number of characters in name String variable
        System.out.println(name.length()); //10
        System.out.println(name.length()+1); //11 because it s a mathematical operation

        //Wrapper Classes
        Byte yourAge=13;
        Boolean isOld = true;

        //If a method is static, you can access to the method by using method name.
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Float.MIN_VALUE);//1.4E-45
        System.out.println(Long.MAX_VALUE);//9223372036854775807
        System.out.println(Double.MAX_VALUE);//1.7976931348623157E308

        int a=12; //Auto Boxing
        Integer b=a; // Un-Boxing;
    }
}
