package practice07;

import java.time.LocalDate;

public class Market {
    /*
        Type a supermarket program to see product name, product price and expiration date.
     */

    private String productName;
    private double productPrice;
    private LocalDate expirationDate;

    public Market (String pName, double price, int monthLater){
        this.productName = pName;
        this.productPrice = price;
        this.expirationDate = LocalDate.now().plusMonths(monthLater);
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
