import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResource {
    public TryWithResource() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("test1.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        }
        catch(FileNotFoundException fne){
            fne.printStackTrace();
            /*
            "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1.2\lib\idea_rt.jar=53455:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Shilpa Batthineni\IdeaProjects\Java\EHPractise\out\production\EHPractise" TryWithResource
java.io.FileNotFoundException: test1.txt (The system cannot find the file specified)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at java.base/java.util.Scanner.<init>(Scanner.java:639)
	at TryWithResource.main(TryWithResource.java:10)

Process finished with exit code 0

             */
        }


    }

}
