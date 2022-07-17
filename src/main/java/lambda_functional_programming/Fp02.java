package lambda_functional_programming;

import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {

    /*
        1) "variable or variables or zero variable" -> "logic"
            The structure is called "Lambda Expression"
        2) In Functional Programming, we can use "Lambda Expression", it is allowed but not recommended.
        Instead of "Lambda Expression", we prefer to use "Method Reference"
        3) Method Reference is "Class Name ::Method Name"
           For example: "String :: length" (Do not type method parenthesis, type just method name)
                        "Arrays :: toString"
           You can use your own class as well, for example you created Animal Class and you have eat() method in Animal Class
           "Animal :: eat"

     */
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);

        printElementsFunctional(l);
        System.out.println();
        printEvenElementsStructured(l);
        System.out.println();
        printSquaredOddElementsStructured(l);
        System.out.println();
        printCubeOfDistinctOddElements(l);
        System.out.println();
        sumOfSquaresOfDistinctEvenElements(l);
        System.out.println();
        printCubeOfDistinctOddElements(l);
        System.out.println();
        getMaximumElement(l);
        System.out.println();
        getMinimumElement(l);



    }
        // 1)Create a method to print the list elements on the console in the same line with a space between
        // two consecutive elements. (Functional with method reference)

        public static void printElementsFunctional(List<Integer> list){
           list.stream().forEach(UtilsNt::printTheSameLineWithSpace);
        }

        // 2) Create a method to print the even list elements on the console in the same line with a space between
        // two consecutive elements. (structured)

         public static void printEvenElementsStructured(List<Integer> list){
            list.stream().filter(UtilsNt::checkToBeEven).forEach(UtilsNt::printTheSameLineWithSpace);
        }

        // 3) Create a method to print the square of odd list elements on the console in the same line with a space between
        // two consecutive elements. (Functional)
        public static void printSquaredOddElementsStructured(List<Integer> list){
            list.stream().filter(UtilsNt::checkToBeOdd).map(UtilsNt::getSquare).forEach(UtilsNt::printTheSameLineWithSpace);
        }

        //4) Create a method to print the cube of distinct odd list elements on the console in the same line
        // with a space between two consecutive elements.

        public static void printCubeOfDistinctOddElements (List<Integer> list){
             list.stream().distinct().filter(UtilsNt::checkToBeOdd).map(UtilsNt::getCube).forEach(UtilsNt::printTheSameLineWithSpace);
        }

        //5) Create a method to calculate the sum of the squares of distinct even elements

        public static void sumOfSquaresOfDistinctEvenElements (List<Integer> list){
            Integer sum = list.stream().distinct().filter(UtilsNt::checkToBeEven).map(UtilsNt::getSquare).reduce(0,Math::addExact);
            System.out.println(sum);
         }

         //6) Create a method to calculate the product of the cubes of distinct even elements
        public static void productOfCubesOfDistinctEvenElements (List<Integer> list){
            Integer prod = list.stream().distinct().filter(UtilsNt::checkToBeEven).map(UtilsNt::getCube).reduce(1,Math::multiplyExact);
            System.out.println(prod);
        }

        //7) Create a method to find the maximum value from the list elements
         public static void getMaximumElement(List<Integer> list){
            Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE,Math::max);
             System.out.println(max);
         }

         //8) Create a method to find the minimum value from the list elements in 2 ways
        public static void getMinimumElement(List<Integer> list){
            Integer min = list.stream().filter(t->t>7).filter(UtilsNt::checkToBeEven).reduce(Integer.MAX_VALUE,Math::min);
            System.out.println(min);
        }

         //9) Create a method to find the minimum value which os greater than 7 and even from the list

         public static void getMinGreaterThanSevenAndEven(List<Integer> list){
             Integer min = list.stream().filter(t->t>7).filter(UtilsNt::checkToBeEven).reduce(Integer.MAX_VALUE,Math::min);
             System.out.println(min);
         }

        //10) Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list
        public static void halfOfElementsDistinctInReverse(List<Integer> list){
            List<Double> res =list.stream().distinct().filter(t->t>5).map(UtilsNt::getHalf).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            System.out.println(res);
        }


    }
