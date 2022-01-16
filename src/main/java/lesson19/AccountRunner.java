package lesson19;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;

public class AccountRunner {

    public static void main(String[] args) throws Exception {
        Account ivanov = new PersonalAccount("Иванов Иван Иванович");
        ivanov.activated();
        ivanov.deposit(BigDecimal.valueOf(10000.00));
        ivanov.withdraw(BigDecimal.valueOf(1500.00));
        ivanov.printBalance();

        Account hornsAndHooves = new CompanyAccount("\"ООО \"Рога и копыта\"",
                "Петров Петр Петрович");
        hornsAndHooves.activated();
        hornsAndHooves.deposit(BigDecimal.valueOf(1000000.00));
        hornsAndHooves.withdraw(BigDecimal.valueOf(35000.00));
        String name;
        Field petrov = hornsAndHooves.getClass().getDeclaredField("director");
        petrov.setAccessible(true);
        name = (String) petrov.get(hornsAndHooves);
        System.out.println("Клиент " + name + " имеет счет в банке на организацию " + hornsAndHooves.getName());
        hornsAndHooves.printBalance();

        Account sidorov = new PersonalAccount("Сидоров Сидр Сидорович");
        Blockable block = (Blockable) Proxy.newProxyInstance(AccountRunner.class.getClassLoader(),
                new Class[] {Blockable.class}, new Handler(sidorov));
        block.activated();
        block.deposit(BigDecimal.valueOf(15000.00));
        block.withdraw(BigDecimal.valueOf(7000.00));
        block.printBalance();
    }
}
