import com.sun.source.tree.WhileLoopTree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader readFile = new FileReader("Numbers.txt") ;
            BufferedReader input = new BufferedReader(readFile);

            String line ;
            int total = 0 ;

            while((line = input.readLine()) != null){
                total += Integer.parseInt(line);
            }
            System.out.println("Toplam : " + total);
            readFile.close();
            input.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}