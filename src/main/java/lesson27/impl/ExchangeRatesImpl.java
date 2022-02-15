package lesson27.impl;

import lesson27.ExchangeRates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExchangeRatesImpl implements ExchangeRates {

    private final ExchangeRatesService exchangeRates;

    @Autowired
    public ExchangeRatesImpl(ExchangeRatesService exchangeRates) {
        this.exchangeRates = exchangeRates;
    }

    @Override
    public void printCurrency() {
        exchangeRates.currencySearch("USD");
    }
}
