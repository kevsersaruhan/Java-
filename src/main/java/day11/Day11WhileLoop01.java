package day11;

public class Day11WhileLoop01 {

    public static void main(String[] args) {
        //Type code to print integers divisible by 4 and 6 from 13 to 211
        //1.Way: By using for-loop
        for(int i=13;i<212;i++){
            if(i%4==0 && i%6==0){
                System.out.print(i+" ");
            }
        }

        //2.Way: By using while loop
        int i=13;

        while(i<212){
            if(i%4==0 && i%6==0){
                System.out.print(i+" ");
            }
            i++;
        }

        System.out.println();
        //Type code to print integers from 3 to 5 by using while loop

        i=3;
        while(i<6){
            System.out.print(i+" ");
            i++;
        }
    }
}
