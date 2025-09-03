package s08_OOP.classesAndObjects;

public class Rectangle {
    int largerSide;
    int shorterSide;

    public Rectangle(int larger, int shorter) {
        this.largerSide = larger;
        this.shorterSide = shorter;
    }


    public int area() {
        return largerSide * shorterSide;

    }

    public int perimeter() {
        return largerSide * 2 + shorterSide * 2;
    }
}
