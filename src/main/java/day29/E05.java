package day29;

public class E05 {
    /*
                What is the difference between "Exception" and "Error"?
               1)"Exception"s can be handled, your app can work after handling Exception
                 "Error"s cannot be handled, your app cannot work after getting any error
               Note 1: "Exception"s and "Error"s are the child of "Throwable"
               Note 2: Common Errors :  i) OutOfMemoryError : If the Heap memory is full
                                        ii) StackOverflowError: It occurs if the Stack memory is full
                                        iii) Linkage Error: It occurs if the "dependant" class has any issue
               Note 3: Custom Exceptions: We can create our own Exception Classes They can be "Checked" CTE or "Unchecked"(Run Time) Exception
                                        i)To be able to create Custom Exceptions gives us flexibility
                                        ii)To be able to create Custom Exceptions protrect the application from developer mistakes

             */
    public static void main(String[] args) throws IllegalGradeException, IllegalAgeException {

        int grade  =120;
/*
        if(grade>100 || grade<0){
            throw  new IllegalGradeException( ("Grades must be from zero to hundred"));
        }else{
            System.out.println("Your grade is "+grade);
        }
*/
        int age = -12;
        if(age<0){
            throw new IllegalAgeException("Age cannot be negative");

        }else{
            System.out.println("Your age is "+age);
        }

    }
}
//How to create "Custom Checked Exception" Class
/*
    Steps to create "Custom Checked Exception"
    1)Make the class child of the "Exception Class"
    2)Use "String message" parameter in the constructor
    3)Create "ToString()" method to be able to see the message when the exception was thrown

 */
class IllegalGradeException extends Exception{
    String message;
    public IllegalGradeException(String message){
        this.message=message;
    }

    public String toString(){
        return message;
    }
}
//How to create "Custom Checked Exception" Class
class IllegalAgeException extends RuntimeException{
    String message;
    public IllegalAgeException(String message){
        this.message=message;
    }

    public String toString(){
        return message;
    }
}


















