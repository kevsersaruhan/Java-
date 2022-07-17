package day14;

import java.util.Arrays;

public class Day14ForEachLoop03 {
    public static void main(String[] args) {
        //Check if the array elements are in the natural order. "A", "B", "C" ==> true "A","C","B" ==> false

        String arr[] = {"A", "C", "B"};
        System.out.println(Arrays.toString(arr));//[A, C, B]

        //How to create a copy of the given array
        String copyOfArr[]= new String[arr.length];//[null,null,null]
        int idx = 0;

        //1.Way
        for(String w : arr){
            copyOfArr[idx] = w;
            idx++;
        }

        System.out.println(Arrays.toString(copyOfArr)); //[A,C,B]
        Arrays.sort(copyOfArr);

        System.out.println(Arrays.toString(copyOfArr));//[A, B, C]

        if(Arrays.equals(arr, copyOfArr)){
            System.out.println("Array elements are in alphabetical order");
        }else{
            System.out.println("Array elements are not in alphabetical order");
        }

        //2.Way by using existing method
        String copyOfArr1[]=Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyOfArr1);
        System.out.println(Arrays.toString(copyOfArr1));//[A, B, C]

        if(Arrays.equals(arr, copyOfArr1)){
            System.out.println("Array elements are in alphabetical order");
        }else{
            System.out.println("Array elements are not in alphabetical order");
        }

        //binarySearch() method in Arrays Class: It is used to check existence of an element in an array
        int brr[] = {12, 13, 5, 11, -2};

        //It is mandatory to be able to get meaningful response from binarySearch()
        //Renvoie l index de l element si celui ci existe, sinon il renvoie le length + 1 en negatif
        // pour dire que si il existerait il serait à cette place là
        Arrays.sort(brr);

        int response = Arrays.binarySearch(brr, 13); //binarySearch() returns the index , if the element exosts
                                                          //so zero or positive integers mean the element exists in the array

        System.out.println(response);

        int response2 = Arrays.binarySearch(brr,10);
        System.out.println(response2);// I will get -6 for 14 i) "-" means does not exist
                                        //                   ii)"6" means if 14 would exist it would be the 6th element
        //Check if a specific element exist in an Array.
        //If the element exists return the index of the element
        //If the element does not exist return a message

        int arr3[]={1,2,3};
        int searchedElement= 2;
        int response3 =Arrays.binarySearch(arr3,searchedElement);

        if(response3>=0){
            System.out.println("The searched element is in index "+response3);
        }else{
            System.out.println("The searched element is not in the array");
        }

    }
}
