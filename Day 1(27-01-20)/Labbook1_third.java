package capgemini.firstproject.welcome;

public class Labbook1_third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Labbook1_third mObject = new Labbook1_third(); 
		System.out.println(mObject.checkNumber(1233));

	}
	
	public boolean checkNumber(int number) {
		
		int value1 = -1,value2 = -2,flag=-1;
		
		while(number > 0 && flag !=0) {	
			value1 = number%10;
			number = number /10;
			value2 = number % 10;
			
			if(value1>=value2) {
				flag = 1;
			}else {
				flag = 0;
			}
			
		}
		
		if(flag == 1) {
			return true;
		}
		return false;
		
		
	}

}
