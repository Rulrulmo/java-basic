package access.b;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public 매서드: deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }

    // public 매서드: withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    // public 매서드: getBalnace
    public int getBalance() {
        return balance;
    }
}
