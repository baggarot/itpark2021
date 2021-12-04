package lesson10;

import javax.swing.*;

public class ConverterRunner {

    public static void main(String[] args) {
        char convertFrom = JOptionPane.showInputDialog("Выберите шкалу температуры: " +
                "'C' - шкала по Цельсию, " +
                "'F' - шкала по Фаренгейту, " +
                "'K' - шкала по Кельвину").charAt(0);
        char convertTo = JOptionPane.showInputDialog("Выберите шкалу температуры: " +
                "'C' - шкала по Цельсию, " +
                "'F' - шкала по Фаренгейту, " +
                "'K' - шкала по Кельвину").charAt(0);
        double temp = Double.parseDouble(JOptionPane.showInputDialog("Введите значенние темппературы"));
        TemperatureConverter convert = new TemperatureConverter(temp);
        JOptionPane.showMessageDialog(null, convert.convertTemperature(temp, convertFrom, convertTo));
    }
}
