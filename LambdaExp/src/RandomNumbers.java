import java.util.function.DoubleSupplier;

public class RandomNumbers {
    public static void main(String[] args) {
        DoubleSupplier randomValues = () -> Math.random() * 100;
        System.out.println(randomValues.getAsDouble());
    }
}
