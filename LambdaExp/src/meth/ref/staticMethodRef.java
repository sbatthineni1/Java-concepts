package meth.ref;

@FunctionalInterface
interface StringFunc {
    String func(String str);
}

class MyStringOp {
    static String strReverse(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return String.valueOf(reverse);

    }
}

public class staticMethodRef {
    public static void main(String[] args) {
        String inStr = "Orginal String";
        // Using static method reference
        StringFunc outStr = MyStringOp::strReverse;
        StringFunc outStr1 = (str) -> MyStringOp.strReverse(str);
        System.out.println(outStr1.func("Hello world"));



        System.out.println(inStr);
        System.out.println(outStr.func(inStr));

    }
}
