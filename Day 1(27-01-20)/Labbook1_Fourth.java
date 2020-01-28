package capgemini.firstproject.welcome;

public class Labbook1_Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labbook1_Fourth mObjectFourth = new Labbook1_Fourth();
		System.out.println(mObjectFourth.checkNumber(16));
	}
	
	public boolean checkNumber(int n) {
		int flag = -1;
		while(n!=1 && flag!=0){
			if(n % 2 == 0) {
				 flag = 1;
			}else {
				flag = 0;
			}
			n = n/2;
			
		}	
		if(flag == 1) {
			return true;
		}
		return false;
		
		
		
	}

}
