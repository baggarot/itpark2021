package lesson19;

import lombok.ToString;

import java.math.BigDecimal;

@ToString
public abstract class Account implements Blockable {

    private final String name;
    private BigDecimal balance;
    private boolean blocked;

    public Account(String name) {
        this.name = name;
        this.balance = BigDecimal.valueOf(0.0);
        this.blocked = true;
    }

    public String getName() {
        return name;
    }

    public void activated() {
        this.blocked = false;
    }

    protected boolean isBlocked() {
        return this.blocked;
    }

    public void deposit(BigDecimal amount) {
        if (isBlocked()) {
            System.out.println("Счет клиента отсутствует или заблокирован!");
        } else balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        if (isBlocked()) {
            System.out.println("Счет клиента отсутствует или заблокирован!");
        } else if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
        } else System.out.println("Недостаточно средст на счете!");
    }

    public abstract void printBalance() throws Exception;
}
