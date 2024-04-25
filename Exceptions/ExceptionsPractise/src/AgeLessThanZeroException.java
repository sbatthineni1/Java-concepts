public class AgeLessThanZeroException extends Exception {
    @Override
    public String toString() {
        return "AgeLessThanZeroException [Age can't be -ve value]";
    }

    /* Here we created a default constructor open custom exception class, so we can throw the exception without any message.
        If we did not create any other constructors in our custom exceptions class, then Java will directly create a default no args constructor for us to use **/
    public AgeLessThanZeroException() {

    }

    //Creating a custom exception constructor with string message as a parameter
    public AgeLessThanZeroException(String message) {
        super(message);
    }
    // We can also use throwable cause as a parameter in our custom created exception constructors, and we can specify the type of exception as the parameter using throwable cause in our execution.
    public AgeLessThanZeroException(Throwable cause) {
        super(cause);
    }

    public AgeLessThanZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeLessThanZeroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
