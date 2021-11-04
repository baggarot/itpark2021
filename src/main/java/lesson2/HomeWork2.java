package lesson2;

public class HomeWork2 {

    public static void main(String[] args){
        System.out.println(waterHammer(4.5,0.3,0.005));
    }

    /**
     * Формула расчета прямого гидравлического удара в стальной трубе
     * @param l длина трубопровода от места удара до сечения, в котором поддерживается постоянное давление, м
     * @param D диаметр трубы, м
     * @param h толщина стенок трубы, м
     * @return
     */
    public static double waterHammer(double l, double D, double h){
        double E = Math.pow(10, 9); // модуль объемной упругости воды
        double speed = 2 * E / 1000;
        double v = Math.sqrt(speed); // скорость распространения звука в жидкости
        double Etr = 1 + 0.01 * D / h * 1;
        double steel = Math.sqrt(Etr);
        double Cu = v * (1 / steel); // скорость распространения ударной волны в трубопроводе
        double T = 2 * l / Cu;
        return T;
    }
}