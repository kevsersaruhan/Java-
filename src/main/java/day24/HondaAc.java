package day24;

public interface HondaAc {

    /*
        You cannot create object from Interfaces
        Interfaces do not have constructors but remember "abstract classes " have.
     */
    /*  1) Every variable is "public", "static", "final" in the interface
        2) If you want type "public", "static", "final" explicitly to make your code more readable
            mostly we do not type "public", "static", "final" explicitly because it is well known by everyone
        3) "final" variables must be initialized because of that every variable in an interface must be initialized
        4) If you have some variables whose signatures are same in parent interfaces, when you call them you have to declare the name
        of the interface otherwise it will give compile time error

     */
     String make = "Samsung";
     double price = 890.00;

     /*
        Methods
            1) All methods in an interface must be abstract
            2) Using "abstract" keyword for methods is optional
            3) All methods in an interface must be "public"
            4) Normally, we cannot put "methods with body" in an interface but Java created "default method" you can use them in an interface they will have body
      */
     void cool();

     void run();

     //"default" over here is not "access odifier", it is for creating method with body in an interface
    default void bacterialKiller(){
         System.out.println("This AC kills %99.9 bacteria");
     }

     //By using "static" keyword, you can create mehtod with body in an interface
     static void climateCool(){
         System.out.println("this AC cools according to the climate");
     }

}
