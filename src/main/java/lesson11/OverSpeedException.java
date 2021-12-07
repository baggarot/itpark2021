package lesson11;

public class OverSpeedException extends Exception {

    private int permissibleSpeed;

    public int getPermissibleSpeed() {
        return permissibleSpeed;
    }

    public OverSpeedException(String massage, int speed) {
        super(massage);
        permissibleSpeed = speed;
    }
}