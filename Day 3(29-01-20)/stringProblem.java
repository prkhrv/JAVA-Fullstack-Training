import java.util.Arrays;

/**
 * stringProblem
 */
public class stringProblem {

    String str[] = { "b", "c","p","d","k"};

    public static void main(String[] args) {
        stringProblem mObject = new stringProblem();
        mObject.showResult(mObject.sortString(mObject.str));

        
    }


    public String[] sortString(String[] arr) {
        int arrLengthtoUpper;
        Arrays.sort(arr);
        if(arr.length%2 == 0){
            arrLengthtoUpper = arr.length/2;
        }else{
            arrLengthtoUpper = arr.length/2+1;
        }
        for(int i=0;i<arrLengthtoUpper;i++){
            arr[i] = arr[i].toUpperCase();
        }
        return arr;
        
    }

    public void showResult(String[] arr) {
		for(String a:arr){
            System.out.println(a);
        }
    }
}