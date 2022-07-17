package day24;


//To make interfaces parent of a concrete class use "implements" keyword instead of "extends"
public class Civic implements HondaAc,HondaEngine, HondaSecurity{


    @Override
    public void cool() {
        System.out.println("Civic uses eco AC");
    }

    @Override
    public void run() {
        System.out.println("Civic runs well");
    }
}
