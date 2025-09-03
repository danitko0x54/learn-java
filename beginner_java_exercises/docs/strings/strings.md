```java
public class Strings {

    public static void main(String[] args) {

        // Cadenas de texto

        // DeclaraciÃ³n

        String name = "Brais";
        var surname = new String("Moure");

        // Operaciones bÃ¡sicas

        // ConcatenaciÃ³n
        System.out.println(name + " " + surname);

        // Longitud
        System.out.println(name.length());

        // Obtener caracter
        System.out.println(name.charAt(name.length() - 1));

        // Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        // MayÃºsculas y minÃºsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name);

        // Comprobar si contiene
        System.out.println("Hola, Java".contains("Brais"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        // ComparaciÃ³n
        System.out.println(name.equals("Brais"));
        System.out.println(name.equals("brais"));
        System.out.println(name.equalsIgnoreCase("brais"));

        // == vs. equals

        var a = "Brais";
        var b = "Brais";
        var c = new String("Brais");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        // Trim
        System.out.println(" Hola, me llamo Brais ".trim());

        // Replace
        System.out.println(" Hola, me llamo Brais ".replace("Brais", "Moure"));

        // Format
        var age = 37;
        System.out.println(String.format("Hola, %s. Tengo %d.", name, age)); // crea una cadena y la imprime
        System.out.printf("Hola, %s. Tengo %d.", name, age); // hace lo mismo que la anterior pero no necesitamos crear la cadena, solo imprime sin crear dato
    }
}

```