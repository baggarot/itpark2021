package lesson27;

import lesson27.impl.ExchangeRatesService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExchangeRatesRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ExchangeRatesService.class);
        ExchangeRates exchangeRates = appContext.getBean(ExchangeRates.class);
        exchangeRates.printCurrency();
    }
}
