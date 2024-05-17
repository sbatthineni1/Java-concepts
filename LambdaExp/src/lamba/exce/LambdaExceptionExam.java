package lamba.exce;

@FunctionalInterface
interface NumericArrayFunc<T> {
    T func(T[] t) throws EmptyArrayException;

}

class EmptyArrayException extends Exception{
    public EmptyArrayException() {
        System.out.println("Empty Array");
    }
}

public class LambdaExceptionExam {
    public static void main(String[] args) throws Exception {


        Double[] values = {};
        NumericArrayFunc<Double> average = (n) -> {
            double sum = 0;
            if (n.length == 0)
                throw new EmptyArrayException();
            for(int i = 0; i < n.length; i++){
                sum = sum +  n[i];
            }
            return sum/n.length;
        };
        System.out.println(average.func(values));
    }
}
