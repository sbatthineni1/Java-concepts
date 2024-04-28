import java.io.*;

public class CharacterStreamExample {
    public static void main(String[] args) throws IOException {

        try (PrintWriter printWriter = new PrintWriter(new File("input.txt"))) {
            printWriter.println("Hello, this is the new file created from print writer");
        }
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("input.txt");
            writer = new FileWriter("out.txt");
            int content;
            while ((content = reader.read()) != -1) {
                writer.append((char) content);

            }
        } finally {
            reader.close();
            writer.close();
        }
    }


}
