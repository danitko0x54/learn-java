package s04_conditionals;

public class Conditionals {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a
        // 18).

        System.out.println("Ejercicio 1 \n============================");

        var userAge = 25;

        if (userAge >= 18) {
            System.out.println("El usuario puede votar");
        } else {
            System.out.println("El usuario no puede votar");
        }

        // 2. Declara dos nÃºmeros y muestra cuÃ¡l es mayor, o si son iguales.

        System.out.println("Ejercicio 2 \n============================");

        var numA = 5;
        var numB = 8;

        if (numA > numB) {
            System.out.printf("%d es mayor que %d", numA, numB);  // uso printf porque no necesito realmente crear un string para imprimirla
        } else if (numA == numB) {
            System.out.println("Ambos numeros son iguales");
        } else {
            System.out.printf("%d es mayor que %d\n", numB, numA);
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        System.out.println("Ejercicio 3 \n============================");

        var numPosNeg = -6;

        if (numPosNeg < 0) {
            System.out.printf("El número %d es negativo\n", numPosNeg);
        } else if (numPosNeg > 0) {
            System.out.printf("El número %d es positivo\n", numPosNeg);
        } else {
            System.out.println("El número es 0");
        }

        // 4. Crea un programa que diga si un número es par o impar.

        var isEven = 7;

        System.out.println("Ejercicio 4 \n============================");

        if (isEven % 2 == 0) {
            System.out.printf("El número %d es par", isEven);
        } else {
            System.out.printf("El número %d es impar\n", isEven);
        }

        // 5. Verifica si un número está en el rango de 1 a 100.

        System.out.println("Ejercicio 5 \n============================");

        var isInRange = 178;

        if (isInRange <= 100 && isInRange > 0) {
            System.out.printf("El número %d está en el rango de 1 a 100\n", isInRange);
        } else {
            System.out.printf("El número %d no está en el rango de 1 a 100\n", isInRange);
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con
        // switch.

        System.out.println("Ejercicio 6 \n============================");

        var dayOfTheWeek = 7;

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No es un día de la semana válido");

        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o
        // "Suspenso" segÃºn la nota (0-100).

        System.out.println("Ejercicio 7 \n============================");

        var qualification = 91;

        if (qualification < 50) {
            System.out.println("Suspenso");
        } else if (qualification < 90) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Sobresaliente");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al
        // menos 15 aÃ±os o ir acompaÃ±ado.

        System.out.println("Ejercicio 8 \n============================");

        var clientAge = 14;
        var isAccompanied = true;

        if (clientAge >= 15 || isAccompanied) {
            System.out.println("Puedes pasar a ver la película.");
        } else {
            System.out.println("No puedes pasar a ver la película.");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        System.out.println("Ejercicio 9 \n============================");

        /* Mi versión

        var letter = "f";
        var vocals = "aeiou";
        if (vocals.contains(letter)) {
            System.out.printf("La letra %s es una vocal \n", letter);
        } else {
            System.out.printf("La letra %s es una consonante \n", letter);
        }
        // Podría ser incompleta porque no usa el tipo adecuado de dato (char), no tiene en cuenta el caso que sean opciones no letra
         */

        char letter = '8';
        System.out.println("Letra " + letter);

        // Conversión a minúscula para la comparación
        char lowerLetter = Character.toLowerCase(letter);

        // Usa verificación de las vocales y si no comprueba que sea una letra
        // El método .isLetter, es estático propio del objeto Character no de las variables
        if (lowerLetter == 'a' || lowerLetter == 'e' || lowerLetter == 'i' || lowerLetter == 'o' ||
                lowerLetter == 'u') {
            System.out.println("La letra '" + lowerLetter + "' es una vocal.");
        } else if (Character.isLetter(lowerLetter)) {
            System.out.println("La letra '" + lowerLetter + "' es una consonante.");
        } else {
            System.out.println("'" + lowerLetter + "' no es una letra.");
        }


        // 10. Usa tres variables a, b, c y muestra cuÃ¡l es el mayor de las tres.

        System.out.println("Ejercicio 10 \n============================");

        var a = 8;
        var b = 1;
        var c = 10;

        if (a == b || b == c || c == a) {
            System.out.println("Hay números coincidentes, no se puede determinar");
        } else {
            if (a > b && a > c) {
                System.out.println("A es el más grande");
            } else if (a < b && b > c) {
                System.out.println("B es el más grande");
            } else {
                System.out.println("C es el más grande");
            }
        }


    }
}