package day17;

public class Runner {
    public static void main(String[] args) {

        StaticKeyword03 std1 = new StaticKeyword03();
        System.out.println("Static counter std1 :"+ std1.counter);//1001


        System.out.println(std1.setStdId("Tom Hanks","Math"));
        StaticKeyword03 std2 = new StaticKeyword03();
        StaticKeyword03 std3 = new StaticKeyword03();

        System.out.println("Std1 static olan counter"+ std1.counter);//1003
        System.out.println(std1.counter);//1002

        System.out.println(std2.setStdId("Kevser Saruhan","Art"));
        System.out.println(std2.counter);//1002
        System.out.println(std1.counter);//1002
    }


}
