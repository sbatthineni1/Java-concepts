import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithMulResource {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("test.txt"));
             /*
             If the scanner does not find file with name "test1.txt", it directly throws an exception to the catch block to handle.
             It does not execute the further code written in try block
              Only when it finds file "test1.txt", then it goes to next line printwrite to create the new file named "testwrite.txt"
              */
             PrintWriter writer = new PrintWriter(new File("testwrite.txt"))) {
            writer.print("This is testwrite file again1");
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            /*
            "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1.2\lib\idea_rt.jar=53393:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Shilpa Batthineni\IdeaProjects\Java\EHPractise\out\production\EHPractise" TryWithMulResource
java.io.FileNotFoundException: test1.txt (The system cannot find the file specified)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at java.base/java.util.Scanner.<init>(Scanner.java:639)
	at TryWithMulResource.main(TryWithMulResource.java:8)

Process finished with exit code 0
             */
        }
    }
}
