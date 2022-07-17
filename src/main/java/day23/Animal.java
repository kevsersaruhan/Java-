package day23;

public class Animal {

    public Animal (){
        System.out.println("Animal construcor worked...");
    }

    public Animal (String msg){
        this();
        System.out.println("Animal "+msg+" construcor worked...");
    }
}
