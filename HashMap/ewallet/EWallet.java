package ewallet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * EWallet
 */
public class EWallet {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    User uObject[] = new User[100];

    HashMap<Integer, Object> userMap = new HashMap<>();

    public static void main(String[] args) {
        EWallet mObject = new EWallet();
    }

    EWallet() {
        int option;
        int i = -1;
        char choice = 'y';
        while(choice == 'y'){
            System.out.println("E-Wallet Options\n 1: Add User\n 2: Login\n 3: Show user Details");
        try {
            option = Integer.parseInt(br.readLine());
            if(option == 1) {
                ++i;
                 uObject[i] = new User();
                 System.out.println("Enter User Details ");
                 System.out.print("User Name :");
                 String userName = br.readLine();
                 System.out.print("Enter password ");
                 String password = br.readLine();
                 System.out.print("Enter email ");
                 String email = br.readLine();
                 uObject[i].addUser(i, userName, password, email);
                 userMap.put(i, uObject[i]);
                 System.out.println(userMap);
            }
            if(option == 3){
                int id;
                System.out.println("Enter user id");
                id = Integer.parseInt(br.readLine());
                if(userMap.containsKey(id)){
                    Object getUser = userMap.get(id);
                    System.out.println("username = "+ (((User) getUser).get_username()) + "\nemail = "+ ((User) getUser).get_email());
                }else{
                    
                }

            }
            System.out.println("Want to continue?");
            choice = br.readLine().charAt(0);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
       

     }
        

        
    }


}