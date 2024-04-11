import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class format {
    public static void main(String[] args) {
        try{
            Writer w = new BufferedWriter(new FileWriter("nbaplayers2.csv"));
            Scanner in = new Scanner(new File("nbaplayers.csv"));

            while (in.hasNextLine()) {
                String s = in.nextLine();
                w.write(s.substring(0, s.length() - 1) + "\n");
            }

            w.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}