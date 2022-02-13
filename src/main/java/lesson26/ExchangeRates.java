package lesson26;

import lombok.SneakyThrows;

public interface ExchangeRates {

    @SneakyThrows
    void currencySearch(String currency);
}
