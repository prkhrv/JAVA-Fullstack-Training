
/**
 * charArray
 */
public class charArray {
    char arr[] = {'a','a','a','a','a','a','v','v','v','b'};
    char test[] = new char[arr.length]; 
    public static void main(String[] args) {

        charArray mObject = new charArray();
        mObject.countOccurences(mObject.arr);
        
    }

    public void countOccurences(char[] arr) {
        int count;
        for (int i = 0; i < arr.length; i++) {
            count= 0;
            if(isChecked(test,arr[i])){
                test[i] = arr[i];
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i] ==arr[j]){
                    count++;
                 }  
          }
            System.out.println("occurence of "+arr[i]+" is "+count);
        }else{
            continue;
        }
            
        }
    }

    public boolean isChecked(char[] check,char ch) {
        for (int i = 0; i < check.length; i++) {
            if(check[i] == ch){
                return false;
            }
        }
        return true;
        
    }
}