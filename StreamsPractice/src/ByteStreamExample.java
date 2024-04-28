import java.io.*;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException {
        PrintWriter writer1 = new PrintWriter(System.out, true);
        writer1.println("Hello, PrintWriter!");
        writer1.println("Hello, PrintWriter!");

        try(PrintWriter writer = new PrintWriter(new File("src.txt"))){
            writer.println("this is the source file");
        }
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {

            inputStream = new FileInputStream("src.txt");
            outputStream = new FileOutputStream("dest.txt");
            int content;
            while((content = inputStream.read()) != -1){
                outputStream.write((byte) content);
            }

        }
        finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
