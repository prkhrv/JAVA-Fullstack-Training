import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lab_Six_Exercise10
 */
public class Lab_Six_Exercise10 {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    public static void main(String[] args) {
        Lab_Six_Exercise10 mObject = new Lab_Six_Exercise10();
        String name;

        System.out.println("Enter the job seeker name");
        try {
            name = mObject.br.readLine();
            System.out.println(mObject.validateJobSeeker(name));
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        // System.out.println(mObject.validateJobSeeker("nameabc_job")); TEST FALSE

        
    }

    public Boolean validateJobSeeker(String name) {
        String[] check = name.split("_");


        if(check.length == 2){
            if(check[0].length() >= 8 && check[1].equals("job")){
            return true;
        }
    }
        
    return false;
        
    }
}