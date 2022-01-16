package lesson19;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public class CompanyAccount extends Account {

    private String director;

    public CompanyAccount(String name, String director) {
        super(name);
        this.director = director;
    }

    @Override
    public void printBalance() throws Exception {
        Class<?> account = this.getClass().getSuperclass();
        Field[] balanceField = account.getDeclaredFields();
        Field balance = balanceField[1];
        balance.setAccessible(true);
        BigDecimal companyBalance = (BigDecimal) balance.get(this);
        System.out.println("текущий баланс компании равен: " + companyBalance + " рублей");
    }
}
