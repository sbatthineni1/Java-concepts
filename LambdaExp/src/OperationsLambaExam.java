import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class OperationsLambaExam {
    public static void main(String[] args) {
        int result = Calculator((var a, var b) -> {
            return a + b;
        }, 5, 3);
        var result1 = Calculator((a, b) -> a / b, 10.0, 2.0);
        var result3 = Calculator((a, b) -> a.toUpperCase() + " " + b.toUpperCase(), "ralph", "lauren");


        var coords = Arrays.asList(
                new double[]{54.37, 23.232},
                new double[]{32.5456, 56.4546},
                new double[]{23.54, 67.45}
        );
        coords.forEach(a -> System.out.println(Arrays.toString(a)));
        BiConsumer<Double, Double> p1 = (lat, lng) -> System.out.println("[lat: " + lat + " lng: " + lng + "]");
        var firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1);
        System.out.println("--------------");
        coords.forEach(s -> processPoint(s[0], s[1], p1));

    }



    //This method is using custom build functional interface
//    public static <T>  T Calculator(Operation<T> function, T value1, T value2){
//        T result = function.operate(value1, value2);
//        System.out.println("The result of operation: " + result);
//        return result;
//    }


// Here are we are using in built functional interface called Binary operator
    public static <T> T Calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("The result of operation: " + result);
        return result;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer){
        consumer.accept(t1,t2);

    }
}
