package s08_OOP.accesModifiers;

// 1. Crea una clase Person con atributos privados name y age. Usa los mÃ©todos
// getName(), setName(), getAge() y setAge() para asignar y mostrar valores
// desde otra clase.

public class PersonM {
    private String name;
    private int age;

    public PersonM(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
            System.err.println("EDAD NO VÁLIDA");
        }

    }
}
