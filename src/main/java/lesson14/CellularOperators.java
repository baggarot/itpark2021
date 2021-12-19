package lesson14;

public enum CellularOperators {
    MTS(1), MEGAFON(2), BEELINE(3), TELE2(4), YOTA(5);

    private final int index;

    CellularOperators(int index) {
        this.index = index;
    }

    public static CellularOperators as(int index) {
        for (CellularOperators cellularOperators : values()) {
            if (cellularOperators.index == index) return cellularOperators;
        }
        return CellularOperators.MTS;
    }
}