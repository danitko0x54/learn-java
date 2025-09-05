package s08_OOP.accesModifiers;

import s08_OOP.classesAndObjects.Book;
import s08_OOP.classesAndObjects.Person;

public class AccessModifiersExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age. Usa los mÃ©todos
        // getName(), setName(), getAge() y setAge() para asignar y mostrar valores
        // desde otra clase.
        System.out.println("\nEjercicio 1 \n==================================================");

        var personM1 = new PersonM("Leonardo", 5);
        System.out.println(personM1.getName());
        System.out.println(personM1.getAge());

        // 2. Crea una clase Product con el atributo privado price. AÃ±ade el mÃ©todo
        // setPrice(double price) que solo permita precios mayores a 0.
        System.out.println("\nEjercicio 2 \n==================================================");

        var productM1 = new ProductM(25.60);
        System.out.println(productM1.getPrice());

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los
        // métodos deposit(double amount) y withdraw(double amount) que validen las
        // cantidades correctamente.
        System.out.println("\nEjercicio 3 \n==================================================");

        var bankAccountM1 = new BankAccountM(25.60);
        bankAccountM1.deposit(7.58);
        bankAccountM1.withdraw(15.00);

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el
        // mÃ©todo getTitle() pero no modificarlo (sin setTitle()). El tÃ­tulo debe
        // asignarse solo por el constructor.
        System.out.println("\nEjercicio 4 \n==================================================");

        var bookM1 = new BookM("Cien Años de Soledad");

        System.out.println(bookM1.getTitle());

        // bookM1.title = "Harry Potter" -> ERROR, no se puede modificar el título es privado y tampoco
        // hay método setter, así que el título puesto es el que se queda.

        // 5. Crea una clase Temperature con el atributo privado celsius. El mÃ©todo
        // setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        System.out.println("\nEjercicio 5 \n==================================================");

        var temperature1 = new Temperature();
        temperature1.setCelsius(25.4);
        System.out.println(temperature1.getCelsius());


        // 6. Crea una clase User con los atributos privados username y password.
        // Implementa los mÃ©todos setUsername(String username), setPassword(String
        // password) y checkPassword(String inputPassword) que compare contraseÃ±as.
        System.out.println("\nEjercicio 6 \n==================================================");

        var user1 = new User();
        user1.setPassword("12345");
        System.out.println(user1.checkPassword("1234"));

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el mÃ©todo
        // raiseSalary(double percent) que solo permita aumentos positivos.

        System.out.println("\nEjercicio 7 \n==================================================");
         var employee1 = new Employee();

        System.out.println(employee1.getSalary());
        employee1.setSalary(1540.98);
        employee1.raiseSalary(30);
        System.out.println(employee1.getSalary());

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega
        // setters y el mÃ©todo calculateArea() que devuelva el resultado de width *
        // height.
        System.out.println("\nEjercicio 8 \n==================================================");

        var rectangleM1 = new RectangleM();
        rectangleM1.setHeight(10);
        rectangleM1.setWidth(3);
        System.out.println(rectangleM1.calculateArea());

        // 9. Crea una clase Student con el atributo privado grade. Agrega los mÃ©todos
        // setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual
        // a 60.
        System.out.println("\nEjercicio 9 \n==================================================");
        var studentM1 = new StudentM();
        studentM1.setGrade(58);
        System.out.println(studentM1.hasPassed());


        // 10. Crea una clase Car con el atributo privado speed. Agrega los mÃ©todos
        // accelerate(int amount) que aumente la velocidad (mÃ¡ximo 120) y brake(int
        // amount) que reduzca la velocidad (mÃ­nimo 0).
        System.out.println("\nEjercicio 10 \n==================================================");
        var carM1 = new CarM();

        carM1.setSpeed(100);
        carM1.accelerate(300);
        System.out.println(carM1.getSpeed());
        carM1.brake(500);
        System.out.println(carM1.getSpeed());

    }
}