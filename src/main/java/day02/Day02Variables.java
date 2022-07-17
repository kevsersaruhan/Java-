package day02;

public class Day02Variables {
    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        //Create a char variable
        //Do not forget to put the value between single quotes
        //Default value of char is the character whose value is zero
        //REgarder le tableau ascii, la valeur zero est attribuée a null donc la valeur par defaut est null

        //If you create a variable inside the main method Java will accept them as static automatically
        char initial = 'S';

        //Create a boolean variable
        //Default value of boolean is false
        boolean isOld = true;
        boolean isAlive = false;

        //Create a byte variable
        //byte ageOfStd = 678;  rouspete car la valeur est plus grande que ce qui est autorisée
        byte ageOfStd = 13;

        //Create a short variable
        short populationOfVillage = 21000;

        //Create a long variable
        //long populationOfWorld = 7123456789; rouspete car depasse les normes
        //long populationOfWorld = 765; // Danc ce cas Java va eviter de prendre beaucoup de place et va l enregistrer en tant qu int
        long populationOfWorld = 765L; // Danc ce cas on va forcer Java a prendre la place d un long dans la memoire

    }

    // Comment creer des variables
    // Data type - Variable Name - Equal sign - Value - Semi colon

    //Create an integer variable
    static int age=12;
    static int height = 183;
    //Create a double variable
    public static double weight = 85.7;

    /*
    Data Types in Java
    1) Primitive data types :
        i) those data types were created by Java, we cannot create any primitive data type
        ii) Primitive data types are 8
            a) byte, short, int, long, float, double / char - boolean
                char : it is for single characters like A, h, ?, &, etc.
                boolean: It is for true-false values
                3+4=7 // si on assigne pas de types ca va retourner true



                // les short comprennent les bytes mais ils ne prennent pas la meme place dans la memoire donc si c est inutile il faut utiliser byte
                //au lieu de short pour sauver de la memoire
                byte: It is used for the values from -128 to 127. It s for whole numbers
                short: It is used for the values from -32 thousand sth to positive 32 thousand sth
                int: It is used for the values from -2 billion sth to 2 billion sth. It is for whole numbers
                long: It is used for the values from ... to ... (look at google)
                float: It is used for decimals. float uses memory less than doubles.
                        When you create float as data type you have to put 'F' or 'f' at the end.
                        float has 7 digits at most in decimal part.
                double: It is used for decimals. double is used for scientific researches and has 16 digits at most in decimal part.


     2) Non-Primitive Data Types
     i) those data types can be created by Java and java developers

    * */
}
