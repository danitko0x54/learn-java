package s08_OOP.accesModifiers;

// 6. Crea una clase User con los atributos privados username y password.
// Implementa los mÃ©todos setUsername(String username), setPassword(String
// password) y checkPassword(String inputPassword) que compare contraseÃ±as


public class User {

    private String username;
    private String password;

    void setUsername(String username) {
        this.username = username;
    }

    void setPassword(String password) {
        this.password = password;
    }

    boolean checkPassword(String inputPassword) {
        if (inputPassword.equals(password)) {
            return true;
        }
        return false;
    }


}
