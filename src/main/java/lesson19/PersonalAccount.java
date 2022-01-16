package lesson19;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public class PersonalAccount extends Account {

    public PersonalAccount(String name) {
        super(name);
    }

    @Override
    public void printBalance() throws Exception {
        Class<?> account = this.getClass().getSuperclass();
        Field[] balanceField = account.getDeclaredFields();
        Field balance = balanceField[1];
        balance.setAccessible(true);
        BigDecimal personalBalance = (BigDecimal) balance.get(this);
        System.out.println("Текущий баланс клиента равен: " + personalBalance + " рублей");
    }
}
