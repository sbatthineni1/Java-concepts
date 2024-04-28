import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {
    public static void main(String[] args) throws IOException {
        char c;

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        do{
//            c = (char)br.read();
//            System.out.println(c);
//        }while( c!= 'q');
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lines of text");
        System.out.println("Enter stop to quit");
        String str;

        do{
            str = br.readLine();
            System.out.println(str);

        }while(!str.equals("stop"));

    }
}
