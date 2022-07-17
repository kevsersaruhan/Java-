package day17;

public class StaticKeyword02 {
    public static void main(String[] args) {
        //Just class name is enough to access "static" things
        System.out.println(StaticKeyword01.sCounter);

        //to access non-static things you have to create object
        StaticKeyword01 obj4 = new StaticKeyword01();
        System.out.println(obj4.counter);//1

        //to access "static" things using objects is allowed
        //but not recommended
        System.out.println(obj4.sCounter);
    }
}
