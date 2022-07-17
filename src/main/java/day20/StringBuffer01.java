package day20;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class StringBuffer01 {
    /*
        1)String class gives you "immutable Strings".
          If you need "mutable Strings" you can use "StringBuilder" or "StringBuffer" Classes

        2)When Java was created, Java created "stringBuffer" Class. But then in Java 1.5, "StringBuilder" came to the stage

        3)"StringBuffer" Class is multi-thread and synchronized but "StringBuilder" is not multi-thread and synchronized
          Java did that to make "StringBuilder" to provide faster mutable String to developers.

          4) When to use "String", "StringBuilder", "StringBuffer"?
            "String": If you want to operate with small amount of data use "String"
            "StringBuilder": If you need single-thread operations with large data in fast pace use "StringBuilder"
            "StringBuffer": Multi-thread operations with large amount of data needs "StringBuffer"

     */
    public static void main(String[] args) {

        String str = "Java";
        LocalDateTime time1 = LocalDateTime.now();
        performanceOfStringBuffer(str);
        LocalDateTime time2 = LocalDateTime.now();
        performanceOfStringBuilder(str);
        LocalDateTime time3 = LocalDateTime.now();
        System.out.println("StringBuffer timer: "+time1.until(time2, ChronoUnit.NANOS));
        System.out.println("StringBuilder timer: "+time2.until(time3, ChronoUnit.NANOS));

    }

    public static StringBuffer performanceOfStringBuffer(String str){
        StringBuffer strBuffer = new StringBuffer(str);
        for(int i=0;i<10000; i++){
            strBuffer.append("abc");
        }
        return strBuffer;
    }

    public static StringBuilder performanceOfStringBuilder( String str){
        StringBuilder strBuilder = new StringBuilder(str);
        for(int i=0;i<10000; i++){
            strBuilder.append("abc");
        }
        return strBuilder;
    }
}
