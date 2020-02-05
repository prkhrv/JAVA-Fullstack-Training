import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Lab_Six_Exercise6
 */
public class Lab_Six_Exercise6 {

    public static void main(String[] args) {
        Lab_Six_Exercise6 mObject = new Lab_Six_Exercise6();
        mObject.fileCheck();

    }

    public void fileCheck() {

        int lines = 0, words = 0, chars = 0;
        String line;
        String[] word;
        try {
            FileReader fr = new FileReader("./file1.txt");
            BufferedReader br = new BufferedReader(fr);
            try {
                while ((line=br.readLine()) != null) {
                    //LINES
                    ++lines;
                    //CHARACTERS
                    char[] myArray = line.toCharArray();
                    chars += myArray.length;
                    //WORDS
                    word = line.split(" ");
                    words += word.length;

                }
                System.out.println("lines = " + lines+" words = " +words+" chars = "+chars);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}