package practice03;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        /*
            Print numbers from given number till the next multiple of 10. e.g.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scan.nextInt();
        for(int i=num;i%10!=0;i++){
            System.out.println(i);
        }

        while(num%10!=0){
            System.out.println(num);
            num++;
        }
    }
}
