package practice07;

import java.time.LocalDate;

public class Market_Runner {
    public static void main(String[] args) {
        Market product1 = new Market("Milk",1.5, 10);

        System.out.println("The product name: "+product1.getProductName());
        System.out.println("The product price: "+product1.getProductPrice());
        System.out.println("The product expiration date: "+product1.getExpirationDate());
    }
}
