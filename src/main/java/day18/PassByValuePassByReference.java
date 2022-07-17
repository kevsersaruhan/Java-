package day18;

public class PassByValuePassByReference {
    /*
        1)Java create copy of values in method calls to protect original value of the variables.
          That process is called "Pass By Value".
        2)By the help of the "Pass By Value", we are able to protect original value.
        3)Some programming languages may use "Pass By Reference", if you use that kind of languages be careful about
        protecting original values.


     */

    public static void main(String[] args) {

        //Pass By Value
        int shirt =100;
        System.out.println(doDiscount("veterans", shirt));//80
        System.out.println(doDiscount("students", shirt));//90
        System.out.println(doDiscount("seniors", shirt));//95
        String greeting ="Woow";
        System.out.println(addExclamationMark(greeting));
        System.out.println(greeting);

        //Pass by reference
    }

    public static int doDiscount(String status, int price){
        switch(status){
            case "students":
                price-=10;
                break;
            case "veterans":
                price-=20;
                break;
            case "seniors":
                price-=5;
                break;
            default:
                price = price;
        }
        return price;
    }

    public static String addExclamationMark (String greeting){
        return (greeting+"!");
    }
}
