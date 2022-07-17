package practice09;

public class Q03 {
    //Create a Java programme to calculate the volume of cylender and rectangular prism. (Use inheritance)
    public static void main(String[] args) {
        Q03_Volume v = new Q03_Volume();
        System.out.println(v.volumeOfCylinder(2,5));
        System.out.println(v.volumeOfRectangularPrism(5,7,6));
    }
}
