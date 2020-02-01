package capgemini;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * AgeValidate
 */
public class AgeValidate {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    int age;

    public static void main(String[] args) {

        AgeValidate mObject = new AgeValidate();
        System.out.println("Enter the age");
        try {
            mObject.age = Integer.parseInt(mObject.br.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            mObject.validateAge(mObject.age);
        } catch (MyException e) {
            // e.printStackTrace();
            System.out.println("Custom validation failed : "+e);
        }


        
    }

    public void validateAge(int age) throws MyException {
        if(age <=15){
            throw new MyException("Invalid Age");
        }else{
            System.out.println("Age is valid");
        }

        
    }
}