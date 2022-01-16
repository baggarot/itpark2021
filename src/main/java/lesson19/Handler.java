package lesson19;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public record Handler(Blockable account) implements InvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
        Blocked accountBlocked = method.getAnnotation(Blocked.class);
        Object result = method.invoke(account, args);
        if (result == null && accountBlocked != null) {
            System.out.println("Невозможно выполнить данную опреацию. Счет клиента заблокирован!");
        }
        return result;
    }
}
