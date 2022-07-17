package day19;

import java.util.function.DoubleToIntFunction;

public class StringBuilder01 {
    /*
        1)String class is "immutable" but sometimes we need "mutable" Strings because of that Java created "StringBuilder"
        and "StringBuffer" classes.
        2)When you use "String str1 = "Java"; to create a String, Java creates a "String Pool" in "Heap" memory and puts the str1 object
        inside the String pool.
        3)When you create a new String by using "String str2= "Java";" Java will check the String Pool
        If there is an object whose value is same then Java does not create a new container, just points the existing one. Java
        does that to save memory.
        4)When multiple pointers point the same object, any update on the object will affect all Strings we do not want it. To
        prevent all Strings to be updated Java created immutability.
        In immutability, existing object will not be updates, Java will create a new object with the new value then change pointer to the new object
        5) If you want to create different objects with the same value, you have to use "new" keyword like "String u = new String("Jdbc");"
        6)If any object does not have any pointer, garbage collector will delete it automatically to make the memory clean.
        7) String Class, all Wrapper Classes(Integers, Characters, Boolean,...) are immutable
        Note: If you use "==" to compare Strings, it will check i)Value ii)Address.
              If both are same you will get true

        Note: equals()method checks just the values not the addresses. If the values are same you will get true.
              When we work with Strings, we work with the values mostly, therefore we use "equals()" when we compare Strings
     */

    public static void main(String[] args) {
        String str1 ="Java";
        String str2  ="Java";

        System.out.println(str1 == str2);//true

        str1 = "Apex";

        System.out.println(str1 == str2); //false
        String accountHolder1 = "Jack";
        String accountHolder2 = "Jack";
        String accountHolder3 = "Jack";

        String s = "Sql";

        s="Mysql";

        String t = "Jdbc";

        String u = new String("Jdbc");

        System.out.println(t==u);//false
        System.out.println(t.equals(u));//true


        //Difference between immutable and mutable classes

        StringBuilder sb1 = new StringBuilder("Tom");
        sb1.append("Hanks");

        System.out.println(sb1);//TomHanks

        String sObj1="Tom";
        sObj1=sObj1.concat("Hanks");
        System.out.println(sObj1);//TomHanks

        StringBuilder sb2 = new StringBuilder("Hanks");
        int numOfChars =sb2.length();
        System.out.println(numOfChars);//5

        int capacity = sb2.capacity();
        System.out.println(capacity);//21

        StringBuilder sb3 = new StringBuilder();
        int n = sb3.length();
        System.out.println(n);//0
        int c =sb3.capacity();
        System.out.println(capacity);//16

        StringBuilder sb4 = new StringBuilder();
        sb4.append("JavaJavaJavaJava").append("XXXXX");
        int d =sb4.capacity();
        System.out.println(d);//34

        //How to decide the capacity
        StringBuilder sb5 = new StringBuilder(2);
        sb5.append("FL!");
        int e = sb5.capacity();
        System.out.println(e);//2*2+2=6

        StringBuilder sb6 = new StringBuilder("Java World");
        sb6.delete(4,9); // index de depart inclusif index de fin exclusif
        System.out.println(sb6);//Java

        StringBuilder sb7 = new StringBuilder("Java World");
        sb7.deleteCharAt(4);
        System.out.println(sb7);

        StringBuilder sb8 = new StringBuilder("Java World");
        sb8.reverse();
        System.out.println(sb8);//dlroW avaJ

        //How to convert a String to StringBuilder
        String str3 = "Java";
        StringBuilder sb9 = new StringBuilder(str3);
        sb9.reverse();
        System.out.println(str3);
        System.out.println(sb9);

        StringBuilder sb10 = new StringBuilder("Java is love");
        String newSb10 = sb10.substring(8); //methods come from "immutable class" cannot update the original value
                                                  // even in mutable classes.
        System.out.println(sb10);//love




    }

}
