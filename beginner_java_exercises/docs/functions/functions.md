```java
import java.util.ArrayList;
import java.util.Arrays;

public class Functions {

    public static void main(String[] args) {

        // Funciones

        for (int index = 0; index < 5; index++) {
            sendEmail();
        }

        // ...

        sendEmail();

        sendEmailToUser("brais@gmail.com");
        sendEmailToUser("brais@gmail.com", "Brais");

        var users = new ArrayList<>(Arrays.asList("brais@gmail.com", "moure@gmail.com"));
        sendEmailToUser(users);

        var state = sendEmailWithState("brais@gmail.com");
        System.out.println(state);

        System.out.println(sendEmailWithState(""));
    }

    // FunciÃ³n sin parÃ¡metros ni retorno

    public static void sendEmail() {
        System.out.println("Se envÃ­a el email");
    }

    // FunciÃ³n con parÃ¡metros

    public static void sendEmailToUser(String email) {
        System.out.println("Se envÃ­a el email a " + email);
    }

    // Sobrecarga de funciones

    public static void sendEmailToUser(String email, String name) {
        System.out.println("Se envÃ­a el email a " + name + " (" + email + ")");
    }

    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String email : emails) {
            sendEmailToUser(email);
        }
    }

    // FunciÃ³n con retorno

    public static boolean sendEmailWithState(String email) {

        if (email.isEmpty()) {
            return false;
        }

        System.out.println("Se envÃ­a el email a " + email);
        return true;
    }
}

```