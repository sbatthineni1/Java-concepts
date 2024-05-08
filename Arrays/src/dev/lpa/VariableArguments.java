package dev.lpa;

public class VariableArguments {
    public static void main(String... args) {

        System.out.println("Hello World");
        String[] splitStrings = "Hello World Again".split(" ");
        printText(splitStrings);

        System.out.println("-".repeat(20));
        printText("Hello", "World", "Again");
        /*
        throws an error if printText is String[] string instead of String... string
        because variable arguments accepts multiple string arguments as well strings array.
        where string[] only accepts string array

        java: method printText in class dev.lpa.VariableArguments cannot be applied to given types;
  required: java.lang.String[]
  found:    java.lang.String,java.lang.String,java.lang.String
  reason: actual and formal argument lists differ in length
         */
        System.out.println("-".repeat(20));

    }
    private static void printText(String... string) {
        for(String element: string){
            System.out.println(element);
        }

    }
}
