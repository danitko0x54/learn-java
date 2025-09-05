package s08_OOP.accesModifiers;

// 8. Crea una clase Rectangle con los atributos privados width y height. Agrega
// setters y el mÃ©todo calculateArea() que devuelva el resultado de width *
// height.

public class RectangleM {
    private int width;
    private int height;

    void setWidth (int size) {
        this.width = size;
    }

    void setHeight (int size) {
        this.height = size;
    }

    public int calculateArea() {
        int area;
        area = height * width;
        return area;
    }



    }
