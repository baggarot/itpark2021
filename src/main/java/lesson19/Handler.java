package lesson19;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public record Handler(Blockable account) implements InvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
        Blocked accountBlocked = method.getAnnotation(Blocked.class);
        if (accountBlocked != null) {
            System.out.println("Невозможно выполнить данную опреацию. Счет клиента заблокирован!");
        } else return method.invoke(account, args);
        return 1;
    }
}
