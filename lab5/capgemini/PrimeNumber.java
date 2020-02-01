package capgemini;

/**
 * primeNumber
 */
public class PrimeNumber {

    public static void main(String[] args) {
        PrimeNumber mObj = new PrimeNumber();
        mObj.primeUpto(19);
        
    }

    public void primeUpto(int n) {

        int flag;

        for (int i = 2; i < n; i++){
            flag = 0;
            for (int j = 2; j<i; j++) {
                if(i%j == 0){
                    flag = flag+1;
                    break;
                }
            }
            if(flag == 0){
                System.out.print(i+" ");  
            }

        }
        
    }


}