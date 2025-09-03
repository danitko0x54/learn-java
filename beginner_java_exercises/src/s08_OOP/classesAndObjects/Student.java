package s08_OOP.classesAndObjects;

public class Student {
    int score;

    public Student(int score) {
        this.score = score;
    }

    public void passed() {
        if (this.score > 60) {
            System.out.println("El alumno está aprobado");
        } else {
            System.out.println("El alumno está suspendido");
        }
    }

}
