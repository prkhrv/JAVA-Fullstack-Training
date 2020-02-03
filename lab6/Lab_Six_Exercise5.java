/**
 * Lab_Six_Exercise5
 */
public class Lab_Six_Exercise5 {

    public static void main(String[] args) {
        Lab_Six_Exercise5 mObject = new Lab_Six_Exercise5();

        //TEST
        System.out.println(mObject.modifyNumber(45862));
        
    }

    public int modifyNumber(int number1) {
        String str = Integer.toString(number1);
        StringBuffer numS = new StringBuffer().append(str);
        StringBuffer AnsString = new StringBuffer();

        for (int i = 0; i < numS.length()-1; i++){
            int test = Math.abs(numS.charAt(i+1) - numS.charAt(i)); 
            AnsString.append(test);
            if(i == numS.length()-2){
                AnsString.append(numS.charAt(i+1));
            }
        }

        return Integer.parseInt(AnsString.toString());


        
    }
}