package s02_operators;

public class Operators {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operaciónn aritmética.
        var a = 8;
        var b = 5;

        var sum = a + b;
        var substraction = a - b;
        var multiplication = a * b;
        var division = a / b;
        var remainder = a % b;

        System.out.println("Ejercicio 1 \n=========================" );

        System.out.println("La suma de a y b es: " + sum);
        System.out.println("La resta de a menos b es: " + substraction);
        System.out.println("La multiplicación de a por b es: " + multiplication);
        System.out.println("La división en enteros de a entre b es: " + division);
        System.out.println("El resto de a entre b es: " + remainder);

        // 2. Crea una variable para cada tipo de operación de asignación.
        var c = 7; // Asignación directa
        System.out.println("Ejercicio 2 \n=========================" );
        System.out.println("La variable c vale: " + c);

        var d = c * 2; // Asignación con operación
        System.out.println("La variable d equivale al doble de c: " + d);

        d += 3; // Reasignación sobre si misma es lo mismo que d = d + 3

        System.out.println("Incrementamos d en 3: " + d);

        d -= 3; // d = d - 3
        System.out.println("Decrementamos d en 3: " + d);

        d *= 3;
        System.out.println("Multiplicamos d por 3: " + d);

        d /= 3;
        System.out.println("Dividimos d entre 3 en enteros: " + d);

        d %= 7;
        System.out.println("El módulo de d entre 7: " + d);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de
        // comparación.

        System.out.println("Ejercicio 3 \n=========================" );

        System.out.println(3 == 9 / 3);
        System.out.println(5 > 3);
        System.out.println(3 + 5 == 4 * 2);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println("Ejercicio 4 \n=========================" );

        System.out.println(10 / 2 == 8 / 2);
        System.out.println(3 >= 9);
        System.out.println(5 != 10 / 2);

        // 5. Utiliza el operador lógico and.

        System.out.println("Ejercicio 5 \n=========================" );

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(10 / 2 == 5 && 8 > 5);

        // 6. Utiliza el operador lógico or.

        System.out.println("Ejercicio 6 \n=========================" );
        boolean isVacation = false;
        boolean isDayOff = true;

        boolean canIRest = isVacation || isDayOff;

        System.out.println("Puedo descansar hoy?: " + canIRest);

        boolean logicEx6 = (10 / 5 == 5 && 8 > 5); // Almacenamos en variable booleana la compración
        System.out.println(logicEx6);

        // 7. Combina ambos operadores lógicos.

        System.out.println("Ejercicio 7 \n=========================" );

        System.out.println((3 > 2 && 5 < 10) || 8 <= 9);

        // 8. Añade algu1na negación.

        System.out.println("Ejercicio 8 \n=========================" );

        System.out.println((3 > 2 && 5 < 10) || !(8 <= 9));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        System.out.println("Ejercicio 9 \n=========================" );

        var e = 5;
        System.out.println("Este es el valor de e en negativo: " + -e);
        System.out.println("Este es el valor de e pero después será incrementado en uno estamos imprimiendo y operando: " + e++);
        System.out.println("Valor actual de e: " + e);
        System.out.println("Valor de e incrmentado antes de imprimir, por tanto valor real y actual: " + ++e);

        // 10. Combina operadores aritméticos, de comparación y lógicos.

        System.out.println("Ejercicio 10 \n=========================" );

        System.out.println((3 * 2 == 8) && 5 < 10 || !(8 <= 9)); // AND tiene precedencia a OR, no hace falta marcarlo


    }
}