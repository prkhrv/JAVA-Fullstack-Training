package capgemini;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * FibUnrec
 */
public class FibUnrec {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(isr);

    public static void main(String[] args) {
        FibUnrec mObject = new FibUnrec();
        mObject.fib();

    }

    public void fib() {
        int n1 = 0,n2 = 1,n3;
        int count = 0;
        System.out.println("Enter the Number ");
        try {
            count = Integer.parseInt(buffer.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(n1+" "+n2);

        for (int i = 2; i <count; i++){
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;


        }
        
    }
}