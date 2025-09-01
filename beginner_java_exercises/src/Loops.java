import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.

        System.out.println("\nEjercicio 1 \n==================================================");

        int index = 1;
        while (index <= 10) {
            System.out.printf("Esta es la iteración número: " + index + "\n");
            index++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.

        System.out.println("\nEjercicio 2 \n==================================================");

        var cardinalList = new ArrayList<String>();
        cardinalList.add("North");
        cardinalList.add("East");
        cardinalList.add("South");
        cardinalList.add("West");

        index = 0;
        do {
           System.out.println("The direction now is: " + cardinalList.get(index));
           index++;
        } while (index < 4);

        // 3. Imprime los mútiplos de 5 del 1 al 50 usando for.

        System.out.println("\nEjercicio 3 \n==================================================");

        for (int i=0; i<=50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.

        System.out.println("\nEjercicio 4 \n==================================================");

        int[] numbers = {1, 3, 5, 7, 13};

        int total = 0;

        for (Integer number : numbers) {
            total += number;
        }

        System.out.println(total);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.

        System.out.println("\nEjercicio 5 \n==================================================");

        String[] pokemons = {"Pikachu", "Squirtle", "Charmander", "Bulbasaur"};
        for (String pokemon : pokemons) {
            System.out.println(pokemon);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.

        System.out.println("\nEjercicio 6 \n==================================================");

        var fruits = new HashSet<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dragonfruit");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        var vegetablesColours = new HashMap<String, String>();

        vegetablesColours.put("Carrot", "Orange");
        vegetablesColours.put("Lettuce", "Green");
        vegetablesColours.put("Tomato", "Red");
        vegetablesColours.put("Onion", "Purple");

        for (Map.Entry<String, String> veggie : vegetablesColours.entrySet()) {
            System.out.println(veggie.getKey());
            System.out.println(veggie.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.

        System.out.println("\nEjercicio 7 \n==================================================");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

        System.out.println("\nEjercicio 8 \n==================================================");

        for (int i = 0; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un
        // array.

        System.out.println("\nEjercicio 9 \n==================================================");

        int[] variousNumbers = {5, 9, -3, 7 , 0};

        for (Integer num : variousNumbers) {
            if (num < 0) {
                break;
            }
            System.out.println(num);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        // Factorial de un número es multiplicando un número por todos sus enteros hasta llegar, por ejemplo
        // de 4, el factorial 4! = 4 x 3 x 2 x 1, la única excepcion es 0!, pues siempre da 1.

        System.out.println("\nEjercicio 10 \n==================================================");

        /* Mi solución

        int factorial = 25;
        int totalFactorial = factorial;


        if (factorial > 0) {
            while (factorial > 1) {
                totalFactorial *= (factorial - 1);
                factorial--;
            }
        } else {
            totalFactorial = 1;
        }


        System.out.println(totalFactorial);


        */

        int numberForFactorial = 5;
        long factorial = 1;

        System.out.println("Calculando el factorial de " + numberForFactorial + ":");

        for (int i = 1; i <= numberForFactorial; i++) {
            factorial *= i;
            System.out.println(i + "! = " + factorial);
        }

        System.out.println("El factorial de " + numberForFactorial + " es " + factorial);








    }
}