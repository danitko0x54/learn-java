package s08_OOP.accesModifiers;

// 5. Crea una clase Temperature con el atributo privado celsius. El mÃ©todo
// setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.

public class Temperature {
    private double celsius;

    void setCelsius(double temperature) {
        if (temperature >= -100 && temperature <= 100) {
            this.celsius = temperature;
        } else {
            System.err.println("TEMPERATURA INCORRECTA, INTRODUZCA UN VALOR ENTRE -100 Y 100");
        }
    }

    double getCelsius() {
        return celsius;
    }

}
