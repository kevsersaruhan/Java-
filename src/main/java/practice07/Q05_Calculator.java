package practice07;

public class Q05_Calculator {
    /*
        Create a basic calculator, create add, subtract, multiply, divide methods
     */
    public void addition(double... arg){
        double result = 0;
        for (double i : arg){
            result+=i;
        }
        System.out.println("The sum is:" +result);
    }
    public void subtraction (double a, double b){

        System.out.println("The difference is "+(a-b));

    }

    public void multiply (double a, double... b){
        double m = a;
        for(double d : b){
            m*=d;
        }
        System.out.println("The multiplication is "+m);
    }

    public void divide (double a, double b){
        if(b==0){
            System.out.println("Do not use 0 in the second parameter");
        } else{
            System.out.println("The division is: "+(a/b));
        }

    }


}
