import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Functions {

    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde
        // cero!".
        System.out.println("\nEjercicio 1 \n==================================================");
        greetingJava();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa
        // persona.
        System.out.println("\nEjercicio 2 \n==================================================");

        personalGreeting("Jose Luís");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        System.out.println("\nEjercicio 3 \n==================================================");

        System.out.println(substraction(8, 3));

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        System.out.println("\nEjercicio 4 \n==================================================");

        int numToSquare = 7;

        System.out.println("El cuadrado de " + numToSquare + " es: " + square(numToSquare));

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        System.out.println("\nEjercicio 5 \n==================================================");

        int numToCheck = 0;

        System.out.println(isEven(numToCheck));

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y
        // false en caso contrario).
        System.out.println("\nEjercicio 6 \n==================================================");

        int ageToCheck = 15;

        System.out.println(isAdult(ageToCheck));

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        System.out.println("\nEjercicio 7 \n==================================================");

        String stringToCheck = "Perro";
        System.out.println(howLong(stringToCheck));

        // 8. Crea un método que reciba un array de enteros, calcula su media y lo
        // retorna.
        System.out.println("\nEjercicio 8 \n==================================================");

        int[] numsToAvg = {5, 7, 123, 69, 2};

        System.out.println(average(numsToAvg));

        // 9. Escribe un método que reciba un número y retorna su factorial.
        System.out.println("\nEjercicio 9 \n==================================================");

        int numToF = 10;

        System.out.println(toFactorial(numToF));

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando
        // cada elemento.

        System.out.println("\nEjercicio 10 \n==================================================");

        var elements = new ArrayList<String>();
        elements.add("fire");
        elements.add("water");
        elements.add("earth");
        elements.add("air");

        readArray(elements);

    }

    // Ej 1

    public static void greetingJava () {
        System.out.println("Bienvenido al curso de Java desde cero!");
    }

    // Ej 2

    public static void personalGreeting (String name) {
        System.out.println("Hola " + name + " bienvenido al curso!") ;
    }

    // Ej 3

    public static int substraction (int numA, int numB) {
        return numA - numB;
    }

    // Ej 4

    public static int square (int num) {
        return num * num;
    }

    // Ej 5
    public static String isEven (int num) {
        if (num % 2 == 0) {
            return (num + " es par");
        }

        return num + " es impar";
    }

    // Ej 6
    public static boolean isAdult (int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }

    // Ej 7
    public static int howLong (String str) {
        return str.length();
    }

    // Ej 8
    public static double average (int[] arr) {
        double total = 0;
        for (int num : arr) {
            total += num;
        }

        return total / arr.length;
    }

    // Ej 9
    public static long toFactorial (int num) {
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;

        }
        return factorial;
    }

    // Ej 10

    public static void readArray (ArrayList<String> listElem) {
        for (String elem : listElem) {
            System.out.println("Now reading: " + elem);
        }

    }





}
