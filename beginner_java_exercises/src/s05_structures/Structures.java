package s05_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Structures {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        System.out.println("\nEjercicio 1 \n==================================================");

        int[] numbers = {3, 4, 6};
        System.out.println(numbers.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes
        // y después de modificarlo.
        System.out.println("\nEjercicio 2 \n==================================================");

        System.out.println(numbers[1]);
        numbers[1] = 8;
        System.out.println(numbers[1]);

        // 3. Crea un ArrayList vacío.
        System.out.println("\nEjercicio 3 \n==================================================");

        var fruits = new ArrayList<String>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        System.out.println("\nEjercicio 4 \n==================================================");

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("dragonfruit");

        System.out.println(fruits.size());
        System.out.println(fruits);

        fruits.remove(2);

        System.out.println(fruits.size());
        System.out.println(fruits);

        // 5. Crea un HashSet con 2 valores diferentes.
        System.out.println("\nEjercicio 5 \n==================================================");

        var colors = new HashSet<String>();
        colors.add("green");
        colors.add("blue");
        System.out.println(colors.size());
        System.out.println(colors);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        System.out.println("\nEjercicio 6 \n==================================================");

        colors.add("red");
        colors.add("blue"); // está repetido no se añadirá
        System.out.println(colors);

        // 7. Elimina uno de los elementos del HashSet.
        System.out.println("\nEjercicio 7 \n==================================================");

        colors.remove("red");
        System.out.println(colors);


        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de
        // teléfono. Añaade tres contactos.

        var agenda = new HashMap<String, Integer>();

        System.out.println("\nEjercicio 8 \n==================================================");

        agenda.put("Jose Antonio Ruíz", 665544890);
        agenda.put("Sonia Rivera", 666944844);
        agenda.put("David Suarez", 675544510);

        System.out.println(agenda);


        // 9. Modifica uno de los contactos y elimina otro.
        System.out.println("\nEjercicio 9 \n==================================================");

        agenda.replace("Sonia Rivera", 666944004);
        agenda.remove("David Suarez");

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet
        // y finalmente en un HashMap con clave y valor iguales.
        System.out.println("\nEjercicio 10 \n==================================================");

        String[] cardinalArray = {"north", "south", "east", "west"};

        // Transformar Array de objetos no primitivos

        ArrayList<String> cardinalArrayList = new ArrayList<>(Arrays.asList(cardinalArray)); // Se crea una variable tipo
            // ArrayList y se crea un nuevo objeto ArrayList y en el argumento usamos un método de objetos Arrays (asList) e
            // esto funciona por ser array de datos no primitivos, sino habría que usar otro método a partir de un bucle.
        System.out.println(cardinalArrayList);

        // Transformar un ArrayList en un HashSet

        var cardinalSet = new HashSet<String>();

        cardinalSet.addAll(cardinalArrayList);
        System.out.println(cardinalSet); // Podemos usar el método addAll añadiendo a un Set una ArrayList directamente
            // como si fuera otro Set

        // Transformar un HashSet en un HashMap

        var cardinalMap = new HashMap<String, String>();

        /* Requiere saber bucles, proxima lección. */












    }
}