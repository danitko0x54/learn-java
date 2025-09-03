```java

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {

        // DeclaraciÃ³n y creaciÃ³n
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // TamaÃ±o

        System.out.println(names.size());

        // InserciÃ³n

        names.add("Brais");
        names.add("Moure");
        names.add("MoureDev");
        System.out.println(names.size());

        // Acceso

        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        // ModificaciÃ³n

        names.set(2, "mouredev@gmail.com");
        System.out.println(names.getLast());

        // EliminaciÃ³n

        names.remove(2);
        // System.out.println(names.get(2)); // Error
        System.out.println(names.size());

        // BÃºsqueda

        System.out.println(names.contains("Brais"));
        System.out.println(names.contains("mouredev@gmail.com"));

        // Limpieza

        names.add("Brais");
        System.out.println(names);
        names.clear();
        System.out.println(names.size());

    }
}


```