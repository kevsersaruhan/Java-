package day02;

public class Day02MethodCreation {


    public static void main(String[] args) {

        System.out.println(addIntegers(3,7));
        // si la methode est utilisee dans une methode static alors elle doit etre static aussi sinon ca ne marche pas
        // Si on veut voir le resultat de la methode dans la console on doit utiliser System.out.println

        System.out.println(multiplyIntegers(4,8));

        System.out.println(subtractIntegers(5,8));

        System.out.println(divideIntegers(5.4,3));
    }

    public static int addIntegers(int a, int b){

        return a+b;
    }

    //Create a multiplication method

    public static int multiplyIntegers(int a, int b){
        return a*b;
    }

    //Create a subtraction method

    public  static int subtractIntegers(int a,int b){
        return a-b;
    }

    //Create a dynamic division method
    public static double divideIntegers(double a, int b){
        return a/b;
    }
    // Selon la logique de Java un int divisé par un int donne un int, mais on demande de retourner un double donc il convertit en double mais
    //il convertit le resultat int en double donc supprime ce qu'il y a apres la virgule
    //il est donc préférable d'utiliser des doubles
    //un double diviser par un double donne un double et là on a le résultat correcte.

}
