/**
 * secondSmallest
 */
public class secondSmallest {
   static int arr[] = {10,23,12,34,56,100};
    int temp;

    public static void main(String[] args) {
        secondSmallest mObject = new secondSmallest();
        System.out.println("The answer is "+mObject.getSecondSmallest(arr));

    }

    public int getSecondSmallest(int[] arr) {
        for (int i = 0;i<arr.length;i++) {
            for (int j =i;j<arr.length;j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
                
            }
            
        }
        return arr[1];
        
    }



}