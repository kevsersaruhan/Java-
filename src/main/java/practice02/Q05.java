package practice02;

import java.util.Scanner;

public class Q05 {
    /*
        Type code to do bank transactions below on ATM:
        Process 1: Balance inquiry
        Process 2: Money withdrawal
        Process 3: Deposit Money
        Process 4: End the process
     */
    public static void main(String[] args) {

        System.out.println("Welcome to TechPro bank ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of process: "+"\n"+"Process 1: Balance inquiry"+"\n"+"Process 2: Money withdrawal"+"\n"+
                "Process 3: Deposit Money"+"\n"+"Process 4: End the process"+"\n");
        int process = scan.nextInt();
        int balance  =100;

        switch (process){
            case 1:
                System.out.println("your balance: "+balance);
                break;

            case 2:
                System.out.println("Enter the money you want to withdraw");
                int withdraw= scan.nextInt();
                if(withdraw>balance){
                    System.out.println("You haven't enough money");
                }else{
                    balance-=withdraw;
                    System.out.println("Your current balance after the withdrawal of "+withdraw+" : "+balance);
                }
                break;
            case 3:
                System.out.println("How much money do you want to deposit: ");
                int deposit = scan.nextInt();
                if(deposit>2000){
                    System.out.println("The daily limit of deposit is : 2000$");
                }else{
                    balance+=deposit;
                    System.out.println("Your current balance after the deposit of "+deposit+" : "+balance);
                }

                break;
            case 4:
                System.out.println("See you later");
                break;
            default:
                System.out.println("Please enter correct process number");
        }

    }
}
