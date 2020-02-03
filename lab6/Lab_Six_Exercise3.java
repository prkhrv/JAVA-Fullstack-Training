import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lab_Six_Exercise3
 */
public class Lab_Six_Exercise3 {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    public static void main(String[] args) {

        Lab_Six_Exercise3 mObject = new Lab_Six_Exercise3();
        System.out.println("Enter the String");

        try {
            String userInput = mObject.br.readLine();
            System.out.println(mObject.getImage(userInput));
        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }

    public String getImage(String inp) {

        StringBuffer sbf = new StringBuffer(inp);
        String ans = inp + "|" + sbf.reverse();

        return ans;
        
    }
}
