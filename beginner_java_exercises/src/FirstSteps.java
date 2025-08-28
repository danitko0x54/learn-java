public class FirstSteps {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("¡Hola Mundo!"); // Es un print que salta la linea al final

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("¡Hola \nMundo!"); // Es un print con salto de línea además entre medio

        // 3. Añade un comentario sobre lo que hace cada línea del programa.

        // 4. Crea un comentario en varias líneas.
        /*
        Soy un comentario
        de varias líneas
        y puedo llegar a
        tener más.
        */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Edad: 40 años \nColor favorito: naranja \nCiudad: Barcelona");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.err.println("Soy un error"); //Imprime por consola, pero en formato error, siempre se ira al final porque es otro flujo de mensajes

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Estoy");
        System.out.println("estudiando");
        System.out.println("programación. :)");

        System.out.print("Estoy"); // Si quitas ln de print, imprime el siguiente seguido
        System.out.print(" estudiando");
        System.out.println(" programación. :)");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("      #    #    #     #    #    ");
        System.out.println("      #   # #   #     #   # #   ");
        System.out.println("      #  #   #  #     #  #   #  ");
        System.out.println("      # #     # #     # #     # ");
        System.out.println("#     # #######  #   #  ####### ");
        System.out.println("#     # #     #   # #   #     # ");
        System.out.println(" #####  #     #    #    #     # ");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.
            // Directamente no deja ni probarlo al borrar el main, se anula el boton de run

        // 10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
            // Si intento cambiar el nombre de archivo se cambia automáticamente en el IDE la clase
            // Si fuerzo cambiar el nombre de clase el programa da error de clase no declarada






    }
}