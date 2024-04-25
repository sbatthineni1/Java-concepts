import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionFNF {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("myFile.txt");
        // when we add throws keyword at main method with exception details, we don't see any error, but the exception is thrown at output since it is not being dealth anywhere in teh code

        //

    }
    public static void readFile(String fileName) throws FileNotFoundException {

        /* here we are manually handling the Filenotfound exception through try catch block
        try {
            FileReader reader = new FileReader(fileName);
        }
        catch (Exception fne){
            System.out.println(fne + " --> File doesn't exist");
        }

         */
        // By adding throws keyword in method declaration we are letting the System throw the exception at runtime
        FileReader reader = new FileReader(fileName);
    }

}
