package day06;

import java.nio.file.LinkPermission;
import java.util.Locale;
import java.util.Scanner;

public class Day06NestedIfStatement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your gender...");
        String gender = scan.next().toLowerCase();//convertir en minuscule pour pouvoir rentrer dans les conditions des if dans tout les cas

        System.out.println("Enter your age...");
        int age = scan.nextInt();

        /*
            If gender is "Male" and age is less than 13 print "Boy" otherwise print "Man on the console
            If the gender is "Female" and the age is less than 13 print "Girl" otherwise print "Woman" on the console
            If the gender is different from "Male" and "Female" print "No information" on the console

            Nested if statement veut dire if imbriqués
            On essaye d'eviter les if imnriqué car pour Java c est une consommation de temps
         */

        if(gender.equals("male")){ //outer if
            if(age<13){ //nested if
                System.out.println("Boy");
            } else{
                System.out.println("Man");
            }

        }else if(gender.equals("female")){
            if(age<13){
                System.out.println("Girl");
            }else{
                System.out.println("Woman");
            }
        }else{
            System.out.println("No information");
        }

    }
}
