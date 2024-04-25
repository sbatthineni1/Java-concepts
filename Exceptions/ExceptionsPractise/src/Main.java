// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        validateAge(10);
        validateAge(-1);
        String name = "unknown";
        if (name != "Shilpa") {
            throw new UserNotFoundException("The user is not Shilpa");
        }


    }

    private static void validateAge(int age) throws AgeLessThanZeroException {
        if (age < 0) {

            /* We can throw Exceptions available with Java or we can create Custom exceptions specific to teh issue
            throw new RuntimeException();

            throw new AgeLessThanZeroException("Age can't be negative");

            throw new AgeLessThanZeroException(new RuntimeException());

             */
            //throw new AgeLessThanZeroException("OOps, Age can't be negative", new RuntimeException());
            throw new AgeLessThanZeroException("OOps, Age can't be negative", new RuntimeException(), false, false);
        } else {
            System.out.println("age : " + age);
        }
    }


}