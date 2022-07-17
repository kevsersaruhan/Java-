package day11;

public class Day11ForLoop01 {

    public static void main(String[] args) {
        //Type code to find the sum of integers from 10 to 14

        int sum=0;
        for(int i=10;i<=14;i++){
            sum+=i;
        }
        System.out.println(sum);

        //Type code to find the multiplication of integers between 10 and 14
        int mult = 1;
        for(int i=10;i<15;i++){
            mult=mult*i;
        }
        System.out.println(mult);

    }
}
