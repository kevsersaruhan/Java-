package practice07;

public class Q01 {
    /*
        Create a method that adds given integers except the first one and multiplies the sum by the first integer.
     */
    public static void main(String[] args) {

        addInt(4,3,5,6,7);

    }
    public static void addInt(int a, int... numbers){
        int sum=0;
        for(int i : numbers){
            sum+=i;
        }
        System.out.println(a*sum);
    }
}
