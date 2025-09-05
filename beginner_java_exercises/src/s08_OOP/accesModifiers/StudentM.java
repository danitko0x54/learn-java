package s08_OOP.accesModifiers;

// 9. Crea una clase Student con el atributo privado grade. Agrega los mÃ©todos
// setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual
// a 60.

public class StudentM {
    private int grade;

    void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean hasPassed() {
        if (grade >= 60) {
            return true;
        }
        return false;
    }

}
