package s08_OOP.classesAndObjects;

public class Worker {
    String name;
    double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }

    public double getSalary() {
        return salary;
    }
}
