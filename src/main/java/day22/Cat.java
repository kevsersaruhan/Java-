package day22;

public class Cat extends Mammal {

    @Override
    public void eat() {
        System.out.println("Cats eat...");
    }

    @Override
    public Animal createAnimal() {
        return new Cat();
    }


}
