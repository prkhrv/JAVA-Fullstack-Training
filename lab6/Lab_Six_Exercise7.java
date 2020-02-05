import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lab_Six_Exercise7
 */
public class Lab_Six_Exercise7 {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String fileName;

    public static void main(String[] args) {
        Lab_Six_Exercise7 mObject = new Lab_Six_Exercise7();
        System.out.println("Enter the file name");
        try {
            mObject.fileName = mObject.br.readLine();
            mObject.fileRead(mObject.fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        

        // TEST
        // mObject.fileRead("file1.txt");


    }

    public void fileRead(String fileName) {
        File file = new File(fileName);
        System.out.println("File "+(file.exists()?"Exists":"Not Found"));
        System.out.println("File Name "+file.getName());
        System.out.println("Is Readable:"+file.canRead());
        System.out.println("IS Writable:"+file.canWrite());
        System.out.println("File Size: "+file.length()+ " bytes");
    }
}