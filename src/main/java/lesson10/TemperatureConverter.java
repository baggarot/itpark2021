package lesson10;

public class TemperatureConverter implements Convertible {

    private double temp;

    public TemperatureConverter(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public double celsiusToFahrenheitConverter(double temp) {
        return temp * 1.8 + 32;
    }

    public double fahrenheitToCelsiusConverter(double temp) {
        return (temp - 32) / 1.8;
    }

    public double celsiusToKelvinConverter(double temp) {
        return temp + 273.15;
    }

    public double kelvinToCelsiusConverter(double temp) {
        return temp - 273.15;
    }

    public double kelvinToFahrenheitConverter(double temp) {
        return temp * 1.8 - 459.67;
    }

    public double fahrenheitToKelvinConverter(double temp) {
        return (temp + 459.67) / 1.8;
    }

    @Override
    public void convertCelsiusToKelvin() {
        System.out.printf("Температура по Цельсию %.2f равна температуре по Кельвину %.2f \n",
                getTemp(), celsiusToKelvinConverter(temp));
    }

    @Override
    public void convertKelvinToCelsius() {
        System.out.printf("Температура по Кельвину %.2f равна температуре по Цельсию %.2f \n",
                getTemp(), kelvinToCelsiusConverter(temp));
    }

    @Override
    public void convertCelsiusToFahrenheit() {
        System.out.printf("Температура по Цельсию %.2f равна температуре по Фаренгейту %.2f \n",
                getTemp(), celsiusToFahrenheitConverter(temp));
    }

    @Override
    public void convertFahrenheitToCelsius() {
        System.out.printf("Температура по Фаренгейту %.2f равна температуре по Цельсию %.2f \n",
                getTemp(), fahrenheitToCelsiusConverter(temp));
    }

    @Override
    public void convertFahrenheitToKelvin() {
        System.out.printf("Температура по Фаренгейту %.2f равна температуре по Кельвину %.2f \n",
                getTemp(), fahrenheitToKelvinConverter(temp));
    }

    @Override
    public void convertKelvinToFahrenheit() {
        System.out.printf("Температура по Кельвину %.2f равна температуре по Фаренгейту %.2f \n",
                getTemp(), kelvinToFahrenheitConverter(temp));
    }
}