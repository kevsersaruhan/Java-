package day29;

public class E01 {
    /*
        1)When you use "Throw" keyword?
        When we want to throw any Exception in a method body, we use "throw" keyword.
        You can use "throw" keyword many times
        After using "throw" keyword, you have to create an Exception Object("new" + "constructor")

     */
    public static void main(String[] args) {
        try{
            setAge(-12);
        }catch (IllegalArgumentException e){
            System.out.println("Ages cannot be nefative...");
        }

    }

    public static void setAge(int age){
        if(age<0){
            throw new IllegalArgumentException();
        }else{
            System.out.println("The age is "+age);
        }
    }
}
