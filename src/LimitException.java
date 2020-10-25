public class LimitException extends Exception {

    private double remainingAmount;

    public LimitException(String message) {
        super(message);
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
