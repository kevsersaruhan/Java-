package day28;

public class E04 {
    //1)"try" block cannot be used alone, can be used with one or more catch block
    //2)"try" block cannot be used alone, can be used without "catch" with "finally" block
    public static void main(String[] args) {
        convertStringToIntegerThenDivideByGivenNumber("2314", 2);//1157
        //convertStringToIntegerThenDivideByGivenNumber("1a",3);//NumberFormatException ==> Runtime Exception
        convertStringToIntegerThenDivideByGivenNumber("12",0);
    }
    public static void convertStringToIntegerThenDivideByGivenNumber(String s, int num){
        try {
            System.out.println(Integer.parseInt(s)/num);
        }catch (NumberFormatException e){
            System.err.println("Issue occurred in conversion");
        }catch (ArithmeticException e){
            System.err.println("Issue occurred in division");
        }
    }
}
