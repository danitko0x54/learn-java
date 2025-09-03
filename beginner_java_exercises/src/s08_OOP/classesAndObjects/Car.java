package s08_OOP.classesAndObjects;

public class Car {
    String brand;
    String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void showData() {
        System.out.println("La marca del coche es " + this.brand + " y su modelo es " + this.model);
    }
}
