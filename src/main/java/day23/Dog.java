package day23;

public class Dog extends Mammal {

    public Dog(){

        super(15);
        System.out.println("Dog constructor worked...");
    }

    public Dog(int i ){
        this();
        System.out.println("Dog constructor with int parameter");

    }
}
