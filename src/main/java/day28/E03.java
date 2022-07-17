package day28;

public class E03 {

    public static void main(String[] args) {
        String str = "Java is easy";
        getNumOfCharInString(str);//12

        String st ="";
        getNumOfCharInString(st);//0

        String s = null;
        getNumOfCharInString(s);//NullPointerException
    }

    public static void getNumOfCharInString(String s){
        try{
            System.out.println(s.length());
        }catch (NullPointerException e ){
            System.err.println(e.getMessage() +" length() method was used with null String");
        }
    }

}
