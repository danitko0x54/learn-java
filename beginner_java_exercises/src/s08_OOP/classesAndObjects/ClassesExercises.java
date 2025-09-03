package s08_OOP.classesAndObjects;

import java.util.ArrayList;

public class ClassesExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra
        // sus datos.
        System.out.println("\nEjercicio 1 \n==================================================");
        var book1 = new Book();
        book1.title = "El Quijote";
        book1.author = "Miguel de Cervantes";

        System.out.println("El libro es " + book1.title + " y el autor es " + book1.author);

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        System.out.println("\nEjercicio 2 \n==================================================");
        var dog1 = new Dog();
        dog1.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.
        System.out.println("\nEjercicio 3 \n==================================================");
        var book2 = new BookCons("Orgullo y Prejuicio", "Jane Austen");
        System.out.println("El libro es " + book2.title + " y el autor es " + book2.author);

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        System.out.println("\nEjercicio 4 \n==================================================");
        var car1 = new Car("Cupra", "Formentor");

        car1.showData();

        // 5. Crea una clase Student con atributo score y un mÃ©todo que diga si aprobó
        // (mayor o igual a 60).
        System.out.println("\nEjercicio 5 \n==================================================");
        var student1 = new Student(89);
        student1.passed();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que
        // sume el saldo.

        System.out.println("\nEjercicio 6 \n==================================================");
        var account1 = new BankAccount();
        account1.deposit(25.54);
        account1.deposit(58.47);

        System.out.printf("El saldo actual es: %.2f \n", account1.balance);

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        System.out.println("\nEjercicio 7 \n==================================================");

        var rectangle1 = new Rectangle(7,3);
        System.out.println("El área de este rectángulo es " + rectangle1.area() + " y su perímetro es " + rectangle1.perimeter());

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para
        // mostrar su salario.
        System.out.println("\nEjercicio 8 \n==================================================");

        var worker1 = new Worker("Juan Domínguez", 2410.10);

        System.out.println("El salario de " + worker1.name + " es " + worker1.getSalary() + "€");

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        System.out.println("\nEjercicio 9 \n==================================================");

        var people = new ArrayList<Person>();

        people.add(new Person("Javier", 25));
        people.add(new Person("Marta", 20));
        people.add(new Person("David", 35));
        people.add(new Person("Sonia", 31));


        for (Person person : people) {
            System.out.println(person.name + " " + person.age);
        }

        // 10. Crea una clase Product y un mÃ©todo que aplique un descuento sobre su
        // precio.

        System.out.println("\nEjercicio 10 \n==================================================");

        var product1 = new Product(51.25);

        product1.getDiscount(10);







    }
}