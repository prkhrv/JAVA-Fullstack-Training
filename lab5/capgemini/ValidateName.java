package capgemini;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ValidateName
 * 
 */

public class ValidateName {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    String first_name = new String();
    String last_name = new String();

    public static void main(String[] args) {

        ValidateName mObject = new ValidateName();

        // TEST CASES
        // mObject.first_name = "John";
        // mObject.last_name = "";
        System.out.println("Enter first name");
        try {
            mObject.first_name = mObject.br.readLine();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        System.out.println("Enter Last name");
        try {
            mObject.last_name = mObject.br.readLine();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            mObject.validateName(mObject.first_name, mObject.last_name);
        } catch (MyException e) {
            // e.printStackTrace();
            System.out.println("Exception Occured "+e);
        }
        
    }


    public void validateName(String first_name,String last_name) throws MyException {
        if(first_name.length() == 0 || last_name.length() == 0) {
            throw new MyException("Name should Not be empty");
        }
        else{
            System.out.println("Valid Names");
        }
    }
}