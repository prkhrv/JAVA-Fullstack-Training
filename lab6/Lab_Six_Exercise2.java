import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Lab_Six_Exercise2
 */
public class Lab_Six_Exercise2 {

    public static void main(String[] args) {
        Lab_Six_Exercise2 mObject = new Lab_Six_Exercise2();
        mObject.fileReader();
    }

    public void fileReader() {
        int lineNum = 1;
        String line;
        try {
            FileReader fr = new FileReader("./file1.txt");
            BufferedReader br = new BufferedReader(fr);
            try {
                while ((line = br.readLine()) != null) {
                    System.out.println(lineNum+" "+line);
                    lineNum++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        
    }
}