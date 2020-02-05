import java.util.Arrays;

/**
 * Lab_Six_Exercise8
 */
public class Lab_Six_Exercise8 {

    public static void main(String[] args) {
        Lab_Six_Exercise8 mObject = new Lab_Six_Exercise8();

       System.out.println(mObject.positiveString("abcd")); 
        
    }
    public Boolean positiveString(String str){
        char[] newStr  = str.toCharArray();
        Arrays.sort(newStr);
        if(str.equals(String.valueOf(newStr))){
            return true;
        }
        return false;
        
    }
}