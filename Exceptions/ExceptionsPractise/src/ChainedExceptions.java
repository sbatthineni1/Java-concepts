public class ChainedExceptions {
    static void demoproc(){
        NullPointerException npe = new NullPointerException();
        npe.initCause(new ArithmeticException());
        throw npe;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }
        catch (NullPointerException e){
            System.out.println("Caught:" + e);

            System.out.println("Original cause "+ e.getCause());

        }
    }
}
