package lesson19;

import java.math.BigDecimal;

public interface Blockable {

    void activated();

    @Blocked
    void deposit(BigDecimal amount) throws Exception;

    @Blocked
    void withdraw(BigDecimal amount) throws Exception;

    void printBalance() throws Exception;
}
