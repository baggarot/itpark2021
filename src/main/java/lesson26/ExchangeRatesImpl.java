package lesson26;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import lombok.Data;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;

@Component
@Data
public class ExchangeRatesImpl implements ExchangeRates {

    @SneakyThrows
    @Override
    public void currencySearch(String currency) {
        URL url = new URL("https://www.cbr-xml-daily.ru/daily_json.js");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        InputStream inputStream = connection.getInputStream();
        DocumentContext jsonContext = JsonPath.parse(inputStream);
        String jsonCreatorDate = jsonContext.read("$.Date");
        String jsonCreatorName = jsonContext.read("$.Valute." + currency + ".Name");
        Double jsonCreatorValue = jsonContext.read("$.Valute." + currency + ".Value");
        System.out.println(jsonCreatorName + " по состоянию на " + jsonCreatorDate + " составляет "
                + jsonCreatorValue + " рублей");
    }
}
