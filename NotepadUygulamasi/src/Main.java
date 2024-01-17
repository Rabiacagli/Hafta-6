import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

        try {
            FileReader file2 = new FileReader("notepad.txt");
            BufferedReader buffread = new BufferedReader(file2);
            String text2 = buffread.readLine();
            System.out.println(text2);
            buffread.close();
            file2.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            File file = new File("notepad.txt");
            PrintWriter output = new PrintWriter(file);
            System.out.print("Notunuzu oluşturun: ");
            String data = text.nextLine();
            output.print(data);
            output.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}