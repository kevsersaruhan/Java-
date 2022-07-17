package practice10;

public class Q03_BMI {

    private double mass;
    private double height;

    public Q03_BMI(double mass, double height){
        this.mass = mass;
        this.height = height;
    }

    public double getMass() {
        return mass;
    }

    public double getHeight() {
        return height;
    }

    public void calculationOfTheBMI(){
        double bmi = mass/(height*height);

        if(bmi<18.5){
            System.out.println("Underweight");
        } else if(bmi>=18.5 &&bmi<25){
            System.out.println("Normal");
        } else if(bmi>=25 && bmi<30){
            System.out.println("Overweight");
        } else if(bmi>30){
            System.out.println("Obese");
        } else{
            System.out.println("Enter valid input");
        }
    }
}
