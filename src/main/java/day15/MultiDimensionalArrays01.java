package day15;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {

        int mda[][]= new int [3][2];
        System.out.println(Arrays.deepToString(mda));//[[0,0],[0,0],[0,0]]

        mda[1][1] = 11;
        mda[2][0] = -7;
        mda[0][0] = 12;
        mda[0][1] = -3;
        mda[1][0] = 5;
        System.out.println(Arrays.deepToString(mda));//[[12,-3],[5,11],[-7,16]]

        //Example 1: Find the sum of the first and the last array elements

        int sum = 0;
        for(int i = 0; i<mda.length;i++){
            if(i == 0 || i == mda.length-1){
                for(int j=0; j<mda[i].length;j++){
                    sum+=mda[i][j];
                }
            }
        }
        System.out.println(sum);//18

        //Find code to find the total number of elements in the multidimensional array
        int numOfElement = 0;
        int arr[][]= {{5,2},{11,13,15},{6},{-2,3,5,12}};
        for(int[]w :arr){
            numOfElement+=w.length;
        }
        System.out.println(numOfElement);

        //Example 3: Print the elements which has "a" in it from a multidimensional array
        String brr[][] = {{"Java","is"},{"easy","to","learn"},{"if","you","study","hard"}};
        for (String[] w:brr) {
            for(String u: w )
            if(u.contains("a")){
                System.out.print(u+" ");
            }

        }

        //Example 4: Convert two=dimensional array to one dimensional array
        String[][] crr = {{"Java","is"},{"easy","to","learn"},{"if","you","study","hard"}};
        int dimension = 0;
        for (String[] w: crr) {
            dimension+=w.length;
        }
        String[] drr = new String[dimension];
        int i=0;
        for(String[] w: crr){
           for(String u: w){
               drr[i]=u;
               i++;
           }
       }

        System.out.println(Arrays.toString(drr));

        //Example 5: Find the sum of the max and min element in an integer multidimensional array
        //1.Way
        int err[][]= {{5,2},{11,13,15},{6},{-2,3,5,12}};
        int min = err[0][0];
        int max = err[0][0];
        for (int[] w: err){
            for(int u: w){
                if(min>u){
                    min=u;
                }
                if(max<u){
                    max=u;
                }
            }
        }
        System.out.println("Min :"+min);
        System.out.println("Max: "+max);
        System.out.println("Sum: "+(min+max));

        //2.Way
        int minn = err[0][0];
        int maxx = err[0][0];
        for (int[] w: err){
            for(int u: w){
               maxx = Math.max(maxx, u);
               minn = Math.min(minn,u);
            }
        }
    }
}
