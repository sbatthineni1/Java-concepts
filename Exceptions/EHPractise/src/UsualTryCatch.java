import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UsualTryCatch {
    public static void main(String[] args) throws FileNotFoundException {
       /* try (PrintWriter writer = new PrintWriter(new File("test.txt"))) {
            writer.println("Hello World");
        }

        */
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("test1.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException fne) {
            fne.printStackTrace();
            /*
            java.io.FileNotFoundException: test1.txt (The system cannot find the file specified)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at java.base/java.util.Scanner.<init>(Scanner.java:639)
	at ResourcesTry.main(ResourcesTry.java:14)
             */

        } finally {
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("File not avialable");
        }


    }

}

