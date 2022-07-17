package practice04;

public class Q03 {
    public static void main(String[] args) {
        int arr[] = {3,1,7,9,23,12};
        //Print just last two elements (use 'continue)

        for(int i=0;i<arr.length;i++){
            if(i<arr.length-2){
                continue;
            }
            System.out.println(arr[i]);
        }

        //Print just first 3 elements (Use 'break')
        for (int j=0; j<arr.length;j++){
            if(j>2){
                break;
            }
            System.out.println(arr[j]);
        }

        //Print the elements from index 2 to index 4 (Use 'continue' and 'break'
        for(int i=0;i<arr.length;i++){
            if(i<2){
                continue;
            }else if(i>4){
                break;
            }
            System.out.println(arr[i]);
        }
    }
}
