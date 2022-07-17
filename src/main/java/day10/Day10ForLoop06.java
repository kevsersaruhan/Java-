package day10;

public class Day10ForLoop06 {
    public static void main(String[] args) {
        //Find the sum of the digits of decimal part in a double number
        //Ex: 23.1528 ==> 1+5+2+8=16

        double d=23.1528;

        //1.Way
        String sd= String.valueOf(d);
        int idx = sd.indexOf(".")+1;
        String decimalPart=sd.substring(idx);

       //2.Way

        String decPart =sd.split("\\.")[1]; //Juste un point \\.
        int decimalPartInt =Integer.valueOf(decimalPart);
        int sum =0;
        for(int i=decimalPartInt;i>0;i=i/10){
            sum =sum + i%10;
        }
        System.out.println(sum);
    }
}
