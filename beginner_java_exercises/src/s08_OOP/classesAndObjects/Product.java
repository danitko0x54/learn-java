package s08_OOP.classesAndObjects;

public class Product {

    double price;

    public Product (double price) {
        this.price = price;
    }

    public void getDiscount(double discount) {
        this.price *= (1 - discount / 100);
        System.out.println("El nuevo precio es " + this.price);
    }



}
