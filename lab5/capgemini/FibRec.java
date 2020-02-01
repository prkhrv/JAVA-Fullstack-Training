package capgemini;

import java.util.Scanner;

/**
 * FibRec
 */
public class FibRec {

    Scanner scan = new Scanner(System.in);

    int n1=0,n2=1,n3,count;

    public static void main(String[] args) {
        FibRec mObject = new FibRec();
        System.out.println("Enter the number");
        mObject.count = mObject.scan.nextInt();
        for (int i = 0; i < mObject.count; i++) {
            System.out.print(mObject.fibonacci(i)+" ");
            
        }
        
    }

    public int fibonacci(int count) {
        if(count==0){
            return 0;
        }
        if(count==1 || count==2){
            return 1;
        }
        return fibonacci(count-2)+ fibonacci(count-1);
        
    }


}