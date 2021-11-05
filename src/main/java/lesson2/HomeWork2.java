package lesson2;

public class HomeWork2 {

    public static void main(String[] args){
        System.out.println(waterHammer(4.5,0.3,0.005));
    }

    /**
     * Формула расчета прямого гидравлического удара в стальной трубе
     * @param pipeLenght длина трубопровода от места удара до сечения, в котором поддерживается постоянное давление, м
     * @param diameter диаметр трубы, м
     * @param wallThickness толщина стенок трубы, м
     * @return фазу гидравлического удара
     */
    public static double waterHammer(double pipeLenght, double diameter, double wallThickness){
        double bulkModulus = Math.pow(10, 9); // модуль объемной упругости воды
        double speed = 2 * bulkModulus / 1000;
        double soundSpeed = Math.sqrt(speed); // скорость распространения звука в жидкости
        double elasticModulus = 1 + 0.01 * diameter / wallThickness * 1;
        double steel = Math.sqrt(elasticModulus);
        double shockWaveVelocity = soundSpeed * (1 / steel); // скорость распространения ударной волны в трубопроводе
        double impactPhase = 2 * pipeLenght / shockWaveVelocity;
        return impactPhase;
    }
}