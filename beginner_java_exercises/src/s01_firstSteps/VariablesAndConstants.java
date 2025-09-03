package s01_firstSteps;

public class VariablesAndConstants {
    public static void main(String[] args) {
        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Danitko";
        System.out.println("Mi nombre es: " + name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 40;
        System.out.println("Mi edad es: " + age);

        // 3. Crea una variable double con tu altura en metros.
        double height = 1.80;
        System.out.println("Mido " + height + " metros");

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean likeProgramming = true;
        System.out.println("¿Me gusta programar? " + likeProgramming);

        // 5. Declara una constante con tu email.
        final String EMAIL = "danitko0x54@gmail.com";
        System.out.println("Mi correo es " + EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char initial = 'D';
        System.out.println("Mi nombre empieza por " + initial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String city = "Barcelona";
        city = "Sant Boi de Llobregat";
        System.out.println("Vivo en " + city);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 5;
        int b= 7;
        System.out.println(a+b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("El tipo de 'name' es: " + name.getClass().getSimpleName()); // método para obtener el tipo de dato
        System.out.println("El tipo de 'age' es: " + ((Object) age).getClass().getSimpleName());
        /*
        Lo mismo que el anterior pero convierte el dato primitivo
        primero en objeto para poder acceder al método
        */

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        String country;
        country = "España";
        System.out.println("Mi país es: " + country);





    }

}
