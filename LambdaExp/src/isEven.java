import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface NumericTest <T>{
    boolean test (T t);
}
public class isEven {
    public static void main(String[] args) {
        NumericTest<Integer> intNum;
        intNum = (n) -> n%2 == 0;
        List<Integer> list = new ArrayList<>(List.of(2,4,6,8,3,1,5,7,9));

        list.forEach(s-> {
            System.out.print(s + " ");
            System.out.println(intNum.test(s));

        });


    }
}
