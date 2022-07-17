package day09;

public class Day09StringManipulations03 {

    public static void main(String[] args) {
        /*
            String shirtPrice ='$12,99';
            String bookPrice = '$35.99';
            Type code to find the sum of the shirt and book price
         */

        String shirtPrice ="$12.99";
        String bookPrice = "$35.99";

        String dShirtPrice = shirtPrice.replaceAll("[^0-9]","");
        String dBookPrice = bookPrice.replaceAll("[^0-9]","");
        double sum =(Double.valueOf(dShirtPrice)+Double.valueOf(dBookPrice))/100;
        System.out.println(sum);


    }
}
