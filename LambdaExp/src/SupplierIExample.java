import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierIExample {
    public static void main(String[] args) {

        String[] names  = {"Ann", "bob", "Carol", "David", "Ed", "Fred"};
        String[] randomList = randomlySelectedValues(5, names, () -> new Random().nextInt(0, names.length));
        System.out.println(Arrays.toString(randomList));

    }
    public static String[] randomlySelectedValues(int count, String[] values, Supplier<Integer> s){
        String[] selectedValues = new String[count];
        for( int i = 0; i < count; i++){
            selectedValues[i] = values[s.get()];

        }
        return selectedValues;
    }
}
