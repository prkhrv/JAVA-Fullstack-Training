import java.util.Arrays;

/**
 * reverseSortedArray
 */
public class reverseSortedArray {

    //test Array
    int[] arr = {543,123,243,120};

    public static void main(String[] args) {
        reverseSortedArray mObject = new reverseSortedArray();
        System.out.println(Arrays.toString(mObject.getSorted(mObject.arr)));
        
    }

    public int[] getSorted(int[] arr){
        for(int i=0; i<arr.length; i++){
            int reverse = 0;
            while(arr[i]!=0){
                reverse = reverse*10;
                reverse = reverse + arr[i]%10;
                arr[i] = arr[i]/10;
            }
            arr[i] = reverse;
        }

        Arrays.sort(arr);
        return arr;
    }
}