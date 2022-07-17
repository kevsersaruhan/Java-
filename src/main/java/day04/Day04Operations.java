package day04;

public class Day04Operations {
/*

Operations in Java
    1) +,-,*,/
        Order of operations :   i)Operation inside parenthesis
                                ii) Multiplication and division
                                iii) additions and subtractions

    2) Increment and Decrement operations
            increment ==> addition and multiplication
            Decrement ==> Subtraction and division

     3)Comparison Operator
     >,<,>=,<=,==,!=
     Note: In math, single equal sign'=' means equality but in Java equal sign '==' means equality
     Note: In Java, '!' means 'not' so '!=" means not equal.
     Note: All comparison operators return boolean

     4) Logical operators
        i) AND operator : && ==> This operator is used between two boolean values
            true && true ==> true
            ture && false ==> false
            false && true ==> false
            false && true ==> false

        ii) OR Operator : || ==> This operator is used between two boolean values
            true || true ==> true
            true || false ==> true
            false || true ==> true
            false || false ==> false




 */

    public static void main(String[] args) {

        // Exemple pour le point 1) les opérations et leurs ordre
        int result = 10 - 6/(2+5/5)+ 7;
        // d'abord on résout la parenthese 2+ 1 =3
        // Ensuite on divise 6 par 3 =2
        // Dernierement on fait l'addition et la soustraction 10 -2 +7 =15
        System.out.println("result = "+result);


        //addition
        int a = 12;
        a=a+3; //a=15
        a+=3; // a=18
        System.out.println("a = "+a);

        //multiplication
        int b= 4;
        b=b*3; // b=12
        b*=3; // b=36
        System.out.println("b = "+b);

        //decrement
        int c = 18;
        c-=3;//c=15
        System.out.println(c);

        int d =24;
        d/=6;
        System.out.println(d);//4

        //Increment and decrement by 1
        int e = 12;
        e= e+1;
        e +=1;
        e++;
        System.out.println(e);

        int f = 16;
        f= f-1;
        f-=1;
        f--;
        System.out.println(f);

        //Comparison Operator
        int h=12;
        int i=13;
        System.out.println(h<i);//true => renvoi un boolean
        System.out.println(h==i);//false
        System.out.println(h<=i);//true
        System.out.println(h!=i);

        //Logical operator

        System.out.println(3<4 && 5>1); //true
        System.out.println(3>4 && 5>1); //false

        System.out.println(3>4 || 5>6); //false
        System.out.println(1<3 || 4>5); //true

        //Post - increment and pre - increment

        //Post increment
        int x= 12;
        int y = x++; //d abord on stocke la valeur de x dans y ensuite on incremente x

        System.out.println(y);

        //Pre-increment
        int m = 12;
        int n= ++m; // d'abord on incremente m ensuite on le met dans la variable n

    }
}
