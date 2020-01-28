package capgemini.firstproject.welcome;

public class Labbook1_second {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Labbook1_second mObject = new Labbook1_second();
		System.out.println(mObject.calculateDifference(10));
		

	}
	
	public int calculateDifference(int n) {
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i =1; i<= n ; i++) {
			sum1 = sum1+ i*i;
			sum2 = sum2 +i;
		}
		
		int final_sum = sum1 - (sum2*sum2);
		
		return final_sum;
		
		
	}

}
