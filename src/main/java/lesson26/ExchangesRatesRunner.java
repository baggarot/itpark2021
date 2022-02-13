package lesson26;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class ExchangesRatesRunner {

    public static void main(String[] args) {
        System.out.println("Введите буквенный код искомого значения валюты");
        Scanner in = new Scanner(System.in);
        String currency = in.next();
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext("lesson26");
        ExchangeRates exchangeRates = appContext.getBean(ExchangeRates.class);
        exchangeRates.currencySearch(currency);
    }
}
