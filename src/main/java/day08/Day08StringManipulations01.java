package day08;

public class Day08StringManipulations01 {

    //If your code is corrects output for some data and it doesn't give correct data for some others
    //It can not be accepted. That kind of codes are called "Hard coding"
    //If your code works for all data, it s called "Dynamic code". Everytime you must make your code "Dynamic code".


    public static void main(String[] args) {
        //Count the alphanetical characters in a given String
            //Tom12 Hanks!...
        String name="Tom12 Hanks!...Mark ";
        int numOfLetters=name.replaceAll("[^A-Za-z]","").length();
        System.out.println("Number of letters: "+numOfLetters);//12

        //Get the initial from full name. (Middle name is out of scope.
        //Tom Hanks ==> TH

        String fullName = "     Tom Hanks   ";
        //trim() method removes the spaces just from the beginning and from the end. It does not touch spaces in the middle.
        //substring(startingIndex, endingIndex) method is used to get a specific part of a string.
        //starting index is inclusive, ending index is exclusive.
        //Note: The variables used inside the method parenthesis are called "Parameters".
        //Note: The values you used inside the method parenthesis are called "Arguments".



        String initialOfFirstName = fullName.trim().substring(0,1).toUpperCase();//trim supprime les espaces de début et de fin , charAt inclus l index 0 exclu l index 1
        System.out.println("Initial of first name: "+initialOfFirstName);

        //split() method is used to split a string into specific parts by using a specific characters
        //The characters you used to split the string will not be visible after splitting.

        String initialOfLastName=fullName.trim().split(" ")[1].substring(0,1).toUpperCase();//split va trouver les espaces (caractères entre les ""
        System.out.println("Initial of last name: "+initialOfLastName);
        System.out.println(initialOfFirstName+initialOfFirstName);//TH

        //Example 3: Fix the day names format like "Sunday"
        //"sunday"==> "Sunday" "SUNDAY" ==> "Sunday"

        String dayName = "    FrIday    ";
        String initialOfDayName = dayName.trim().substring(0,1).toUpperCase();
        String otherChasOfDayName = dayName.trim().substring(1).toLowerCase();
        System.out.println(initialOfDayName+otherChasOfDayName);

        //Example 4: Make all digits except last 4 digits of a credit card invisible by using '*'
        //1234 1234 1234 1234 ==> **** **** **** 1234
        //Note 1: \\S different from space (Uppercase means 'different from')
        //Note 2: \\s This has positive meaning, (Space characters)

        String creditCardNumber = "1234 1234 1234 1234";
        String invisiblePart = creditCardNumber.substring(0,15).replaceAll("\\S","*");
        String visiblePart = creditCardNumber.substring(15);
        System.out.println(invisiblePart+visiblePart);

        //Example 5: Count how many characters different from space were used in a String
        //"Tom Hanks was born in 1975."
        //1.Way:

        String s="Tom Hanks was born in 1975.";
        int numOfChars=s.replace(" ","").length();
        System.out.println("numOfChars: "+numOfChars);


        //2.Way

        int numOfCharacters= s.replace(" ","").split("").length;
        System.out.println(numOfCharacters);


    }
}
