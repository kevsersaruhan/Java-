package practice09;

public class Q05 {
    /*
           Create a method to calculate 4 students 6,4,3 and 5 exams average respectively
     */
    public static void main(String[] args) {
        calculateAverage("Ali", 50,23,54,64);
        calculateAverage("Veli", 5,54,56,79);
    }
    public static  void calculateAverage(String stdName, double... score){
        double sum=0;
        for(double i: score){
            sum+=i;
        }
        System.out.println(stdName+" "+String.format("%.2",sum/ score.length));
    }
}
