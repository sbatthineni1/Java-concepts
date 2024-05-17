
@FunctionalInterface
interface ReverseOp<T> {
    T func(T t);

}

public class StringReverse {
    public static void main(String[] args) {

        ReverseOp<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;

        };
        System.out.println(reverse.func("Lambda"));
        ReverseOp<Integer> valuesRev = (var num) -> {
            int temp = 0;
            while (num > 0) {
                temp = (temp + (num % 10)) * 10 ;
                num /= 10;
            }
            return temp/10;
        };
        System.out.println(valuesRev.func(1234));
    }
}
