package meth.ref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

class PlainOld {
    private static int last_id = 1;
    private int id;

    public PlainOld() {
        id = PlainOld.last_id++;
        System.out.println("Creating plainOld object: " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Ann", "Bob", "Carol", "David", "Ed", "Fred"));
        list.forEach(System.out::println);
        System.out.println("------------");

        // using Lambda expression --> output 30
        Calculator((a, b) -> a + b, 10, 20);

        // using method reference  --> output 30
        Calculator(Integer::sum, 10, 20);

        Calculator(Double::sum, 2.5, 3.5);
        Calculator((a, b) -> a / b, 20, 10);

        PlainOld plainOld = new PlainOld();
        System.out.println(plainOld);
        Supplier<PlainOld> reference = PlainOld::new;
        reference.get();
        System.out.println("-------------");
        PlainOld[] newPojo = seedArray(reference, 10);


    }

    public static <T> void Calculator(BinaryOperator<T> operations, T t1, T t2) {
        T result = operations.apply(t1, t2);
        System.out.println(result);
    }

    private static PlainOld[] seedArray(Supplier<PlainOld> reference, int count) {
        PlainOld[] array = new PlainOld[count];
        Arrays.setAll(array, i -> reference.get());
        return array;
    }

}
