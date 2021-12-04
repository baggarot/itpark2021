package lesson10;

import java.util.Scanner;

public class ConverterRunner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значенние темппературы");
        double tempCelsToKelv = in.nextDouble();
        TemperatureConverter converterFirst = new TemperatureConverter(tempCelsToKelv);
        converterFirst.celsiusToKelvinConverter(tempCelsToKelv);
        converterFirst.convertCelsiusToKelvin();
        double tempKelvToCels = in.nextDouble();
        TemperatureConverter converterSecond = new TemperatureConverter(tempKelvToCels);
        converterSecond.kelvinToCelsiusConverter(tempKelvToCels);
        converterSecond.convertKelvinToCelsius();
        double tempCelsToFahr = in.nextDouble();
        TemperatureConverter converterThird = new TemperatureConverter(tempCelsToFahr);
        converterThird.celsiusToFahrenheitConverter(tempCelsToFahr);
        converterThird.convertCelsiusToFahrenheit();
        double tempFahrToCels = in.nextDouble();
        TemperatureConverter converterFourth = new TemperatureConverter(tempFahrToCels);
        converterFourth.fahrenheitToCelsiusConverter(tempFahrToCels);
        converterFourth.convertFahrenheitToCelsius();
        double tempFahrToKelv = in.nextDouble();
        TemperatureConverter converterFifth = new TemperatureConverter(tempFahrToKelv);
        converterFifth.fahrenheitToKelvinConverter(tempFahrToKelv);
        converterFifth.convertFahrenheitToKelvin();
        double tempKelvToFahr = in.nextDouble();
        TemperatureConverter converterSixth = new TemperatureConverter(tempKelvToFahr);
        converterSixth.kelvinToFahrenheitConverter(tempKelvToFahr);
        converterSixth.convertKelvinToFahrenheit();
    }
}
