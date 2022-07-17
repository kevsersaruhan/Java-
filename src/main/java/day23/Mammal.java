package day23;

public class Mammal extends Animal {

    public Mammal(){
        super("wow");
        System.out.println("Mammal constructor worked...");
    }

    public Mammal(int i){
        super("hi");
        System.out.println("Mammal constructor with int parameter worked...");
    }
    public Mammal(String s){
       this();
        System.out.println("Mammal constructor with String parameter worked...");
    }
}
