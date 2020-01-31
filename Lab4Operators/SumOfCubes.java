import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * SumOfCubes
 */
public class SumOfCubes {

    int num;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader bufferReader = new BufferedReader(isr);

    public static void main(String[] args) {
        SumOfCubes mObject = new SumOfCubes();
        System.out.println("Enter the Number");
        try {
            mObject.num = Integer.parseInt(mObject.bufferReader.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(mObject.sum(mObject.num));
        
    }

    public int sum(int n) {
        int sum = 0,rev;
        while(n!=0){
            rev = n %10;
            sum = sum + (rev*rev*rev);
            n = n/10;
        }

        return sum;
        
    }

    
}

