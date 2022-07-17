package practice04;

public class Q07 {
    public static void main(String[] args) {
        //Type code to print the elements of an array those are greater than average.
        //int[] arr = {5,9,15,1,0,11,3};

        int[] arr = {5,9,15,1,0,11,3};
        int av = 0;

        for (int w : arr){
            av+=w;
        }
        av=av/arr.length;
        for (int w: arr){
            if(w>av){
                System.out.println(w);
            }
        }
    }
}
