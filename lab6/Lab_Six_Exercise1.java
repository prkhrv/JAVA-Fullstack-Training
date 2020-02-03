import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Lab_Six_Exercise1
 */
public class Lab_Six_Exercise1 {

    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ir);

    public static void main(String[] args) {
        Lab_Six_Exercise1 mObject = new Lab_Six_Exercise1();
        mObject.stringTokenizer();

    }

    public void stringTokenizer() {
        int sum = 0,n;
        String number = ""; 
        System.out.println("Enter the Numbers");
        try {
            number = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringTokenizer tokenizer = new StringTokenizer(number," ");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            n = Integer.parseInt(token);
            System.out.println(n);
            sum += n;
        }
        System.out.println("The sum is " + sum);


        
        
    }
}