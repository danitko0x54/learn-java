package s08_OOP.accesModifiers;
// 3. Crea una clase BankAccount con el atributo privado balance. Implementa los
// métodos deposit(double amount) y withdraw(double amount) que validen las
// cantidades correctamente.

public class BankAccountM {
    private double balance;

    public BankAccountM(double amount){
        this.setBalance(amount);
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("Su saldo actual es de %.2f \n", balance);
        } else {
            System.err.println("NO PUEDE DEPOSITAR UNA CANTIDAD NEGATIVA");
        }

    }

    void withdraw (double amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.printf("Su saldo actual es de %.2f \n", balance);
        } else {
            System.err.println("ESTÁ INTENTANDO RETIRAR MÁS DINERO DEL DISPONIBLE");
        }
    }


}
