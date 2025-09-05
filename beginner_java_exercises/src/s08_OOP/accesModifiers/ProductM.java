package s08_OOP.accesModifiers;
// 2. Crea una clase Product con el atributo privado price. AÃ±ade el mÃ©todo
// setPrice(double price) que solo permita precios mayores a 0.


public class ProductM {

    private double price;

    public ProductM(double price) {
        this.setPrice(price);
    }

    public void getDiscount(double discount) {
        this.price *= (1 - discount / 100);
        System.out.println("El nuevo precio es " + this.price);
    }

    double getPrice () {
        return this.price;
    }

    void setPrice (double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0;
            System.err.println("SOLO PRECIOS MAYORES A 0");
        }

    }





}
