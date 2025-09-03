package s03_strings;

public class Strings {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.

        System.out.println("Ejercicio 1 \n============================");

        var stringA = "Primera parte del texto";
        var stringB = "y segunda parte del texto";
        System.out.println(stringA + " " + stringB);

        // 2. Muestra la longitud de una cadena de texto.

        System.out.println("Ejercicio 2 \n============================");

        var stringToCount = "Más vale pájaro en mano que ciento volando";
        System.out.println(stringToCount.length());

        // 3. Muestra el primer y Ãºltimo carÃ¡cter de un string.

        System.out.println("Ejercicio 3 \n============================");
        var firstAndLast = "Más vale maña que fuerza";
        System.out.println("El primer caracter es " + firstAndLast.charAt(0) + " y el último caracter es " +
                firstAndLast.charAt((firstAndLast.length() - 1)));

        // 4. Convierte a mayÃºsculas y minÃºsculas un string.

        System.out.println("Ejercicio 4 \n============================");

        var caseAlternate =  "Cree el ladrón que son todos de su condición.";
        var allUppercase = caseAlternate.toUpperCase();
        var allLowercase = caseAlternate.toLowerCase();

        System.out.println(allLowercase + " " + allUppercase);

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.

        System.out.println("Ejercicio 5 \n============================");

        var match = "En casa del herrero cuchillo de palo";
        var wordToCheck = "herrero";

        System.out.println(match.contains(wordToCheck));

        // 6. Formatea un string con un entero.

        System.out.println("Ejercicio 6 \n============================");
        var name = "Dani";
        var age = 40;

        System.out.println(String.format("Me llamo %s y tengo %d años", name, age));

        // 7. Elimina los espacios en blanco al principio y final de un string.

        System.out.println("Ejercicio 7 \n============================");

        var tooMuchSpace = "   Aqui hay demasiado espacio al inicio y al final         ";
        var rightSpace = tooMuchSpace.trim();
        System.out.println(rightSpace);

        // 8. Sustituye todos los espacios en blanco de un string por un guiÃ³n (-).
        System.out.println("Ejercicio 8 \n============================");

        var location = "Stratford upon Avon";
        var locationDashed = location.replace(" ", "-");
        System.out.println(locationDashed);

        // 9. Comprueba si dos strings son iguales.
        System.out.println("Ejercicio 9 \n============================");

        var city = "Barcelona";
        System.out.println(city.equals("Barcelona"));

        // 10. Comprueba si dos strings tienen la misma longitud.

        System.out.println("Ejercicio 10 \n============================");

        var word1 = "abracadabra";
        var word2 = "alakazam";
        boolean wordLengthMatch = word1.length() == word2.length();

        System.out.println("¿La palabra 1 y 2 tienen la misma cantidad de letras? " + wordLengthMatch);

        //Inventado por mí
        //11. Dada una cadena eliminar todos los espacios sobrantes tanto dobles como al inicio y al final

        System.out.println("Ejercicio 11 \n============================");

        var textToClean = "    En un lugar  de la Mancha, cuyo  nombre no quiero  acordarme      ";
        var cleanText = textToClean.trim().replace("  ", " ");
        System.out.println(cleanText);



    }
}
