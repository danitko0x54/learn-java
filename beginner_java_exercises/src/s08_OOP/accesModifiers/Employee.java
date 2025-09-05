package s08_OOP.accesModifiers;

// 7. Crea una clase Employee con el atributo privado salary. Agrega el mÃ©todo
// raiseSalary(double percent) que solo permita aumentos positivos.

public class Employee {
    private double salary;

    void setSalary(double salary) {
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

    void raiseSalary(double percent) {
        this.salary *= (1 + percent/100);

    }

}
