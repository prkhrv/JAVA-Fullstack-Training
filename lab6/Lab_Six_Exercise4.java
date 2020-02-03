import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lab_Six_Exercise4
 */
public class Lab_Six_Exercise4 {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    public static void main(String[] args) {

        Lab_Six_Exercise4 mObject = new Lab_Six_Exercise4();
        // TEST STRING
        // String test = "JAVA";
        System.out.println("Enter The String");
        String userInput;
        try {
            userInput = mObject.br.readLine();
            System.out.println(mObject.alterString(userInput.toCharArray()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    public String alterString(char[] str) {

        for (int i = 0; i < str.length; i++) {
            if(!isVowel(str[i])){
                if(str[i] == 'z'){
                    str[i] = 'b';
                }else{
                    str[i] = (char)(str[i]+1);
                    if(isVowel(str[i])){
                        str[i] = (char)(str[i]+1);
                    }
                }

            }
        }
        
        return String.valueOf(str);
    }

    public boolean isVowel(char s) {
        if(s == 'a'|| s=='A'|| s == 'e'|| s=='E'|| s == 'i'|| s=='I'|| s == 'o'|| s=='O'|| s == 'u'|| s=='U'){
            return true;
        }
        return false;
        
    }
}