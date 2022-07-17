public class Q01MentoringSession {
    public static void main(String[] args) {

        //first value of i 1
        //second value of i 2
        // third value of i 3

        for (int i=1;i<=5;i++){

            // first value of j = 5-1 = 4
            // second value of j = 4-1 = 3
            // third value of j = 3 -1 =2
            // fourth value of j = 2-1 = 1
            for(int j=(5-i);j>1;j--){

                // i = 1 ve j = 4 => 4+1 =5
                // i = 1 ve j = 3 => 3+1 =4
                // i =1 ve j = 2 => 2+1 = 3
                System.out.print(i+j);  //543
                                        //54
                                        //5
            }
            System.out.println();
        }

    }
}
