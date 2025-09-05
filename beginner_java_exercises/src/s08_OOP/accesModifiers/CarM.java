package s08_OOP.accesModifiers;

// 10. Crea una clase Car con el atributo privado speed. Agrega los mÃ©todos
// accelerate(int amount) que aumente la velocidad (mÃ¡ximo 120) y brake(int
// amount) que reduzca la velocidad (mÃ­nimo 0).

public class CarM {
    private int speed;

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getSpeed () {
        return speed;
    }

    void accelerate (int amount) {
        final int MAXSPEED = 120;
        if (speed + amount < MAXSPEED) {
            speed += amount;
        } else {
            speed = MAXSPEED;
        }
    }

    void brake (int amount) {
        final int MINIMALSPEED = 0;
        if (speed - amount >= MINIMALSPEED) {
            speed -= amount;
        } else {
            speed = MINIMALSPEED;
        }
    }



}
