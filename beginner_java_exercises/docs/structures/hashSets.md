```java

import java.util.HashSet;

public class Sets {

    public static void main(String[] args) {

        // DeclaraciÃ³n y creaciÃ³n
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // TamaÃ±o

        System.out.println(names.size());

        // InserciÃ³n

        names.add("Brais");
        names.add("Moure");
        names.add("MoureDev");
        names.add("mouredev@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // EliminaciÃ³n

        names.remove("Brais");
        System.out.println(names.size());

        // BÃºsqueda

        System.out.println(names.contains("Brais"));
        System.out.println(names.contains("mouredev@gmail.com"));

        System.out.println(names);
        names.add("Moure");
        names.add("Moure");
        names.add("Moure");
        System.out.println(names);

        // Conjuntos

        // names.addAll(numbers); Error

        var countries = new HashSet<String>();
        countries.add("EspaÃ±a");
        countries.add("MÃ©xico");
        countries.add("Argentina");
        countries.add("MoureDev");

        names.addAll(countries);
        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);

        names.retainAll(countries);
        System.out.println(names);
    }
}

```