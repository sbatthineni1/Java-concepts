public class UnCheckedExceptionNPE {
    public static void main(String[] args) {
        String name = null;
        printLength(name);

    }

    public static void printLength(String message) {
        try {
            System.out.println(message.length());
        }
        catch (NullPointerException npe){
            System.out.println("String can not be null");
        }
    }
}
