package interviewQuestions;

public class InterviewQuestion02 {

    /*
        What are the differences between "abstract class" and "interface"?

        1)Methods: i)"abstract class" can have both "abstract" and "concrete" methods
                    "interfaces" can have just "abstract" methods.
                    Note: We can create "methods with body" by using "default" and "static" keywords
                   ii) Methods in "abstract class" can use any "access modifier"
                        Methods un abstract are definitely "public"
        2)Variables: i) "abstract class" can have every type of variables
                        "interface" can have just "public", "static" and "final" variables.
                        Note: Variables are "final" in interface because of that they must be initialized
                              Variables may or may not be "final" in abstract class because of that it is not mandatory to initialize
        3)NOTE: By the help of the "interfaces" we can create "multiple parents" for a class but
                when you use "abstract classes" it is impossible to create "multiple parents" for a class
        4)Class "extends" Class, Interface "extends" Interface, Class "implements" Interface, Interface "cannot be the child" of a Class


     */
}
