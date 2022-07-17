package practice07;

public class Q04 {
    /*
        Create a method that joins the given Strings
     */

    public static void main(String[] args) {
        joinString("Please","join","given","words");
    }
    public static void joinString (String... arg){
        String joinedString="";
        for(String s: arg){
            joinedString+=s+" ";
        }
        System.out.println(joinedString);
    }
}
