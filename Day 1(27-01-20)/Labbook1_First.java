package capgemini.firstproject.welcome;

public class Labbook1_First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labbook1_First mObject = new Labbook1_First();
		System.out.println(mObject.calculateSum(5));
		
   }
	public int calculateSum(int number) {
		int sum = 0;
		for(int i=1;i<= number; i++) {
			if(i%3 == 0 || i%5 == 0) {
				sum = sum +i;
			}
		}
		return sum;
		
	}
	

}
