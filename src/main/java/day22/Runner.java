package day22;

public class Runner {
 /*
        1)"Method Overriding" means updating "method body" to make the implementation specific for the "Child Class"
        2)Mostly we do not touch "access modifier", and "return type" of the "overridden method"(The method in the parent class)
        3)In "Method Overriding", method name cannot be changed.
          If you change the method name it means you are creating a new method
        4)Inheritance is prerequisite for "Method Overriding". If there is no parent-child relationship,
          there will be no "Method Overriding"
        5)The method in child class is called "Overriding Method"
        6)Access modifier of "Overriding Method" cannot be narrower than the access modifier of "Overridden Method"
        7)Return Type cannot be narrower than the data returned
        8)Return type of "Overriding Method" cannot be wider than the @Override
        Note: Normally return type can be "Object" everytime but in "Method Overriding" it can be the return type of the "Overridden Method" at most.
        Example: The return type of the "Overridden Method" is Mammal.
                 What can be the return type of the method produces a Dog object ==> Dog and Mammal

  */
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();

        Dog d = new Dog();
        d.eat();//Animals eat...
        //Dogs are animals so they eat as well...

    }
}
