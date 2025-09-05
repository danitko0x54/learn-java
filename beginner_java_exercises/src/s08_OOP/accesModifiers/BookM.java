package s08_OOP.accesModifiers;

// 4. Crea una clase Book con el atributo privado title. Permite leerlo con el
// mÃ©todo getTitle() pero no modificarlo (sin setTitle()). El título debe
// asignarse solo por el constructor.

public class BookM {

    private String title;


    public BookM(String title) {
        this.title = title;

    }

    String getTitle() {
        return title;
    }
}
