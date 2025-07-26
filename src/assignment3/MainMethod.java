package assignment3;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenerateAadhar objGA=new GenerateAadhar();
		
		objGA.toGenerateAadhar("Shiva");
		objGA.getAadharNumber();
		
		objGA.toGenerateAadhar("Shiva", "10-01-1998");
		objGA.getAadharNumber();
		
		objGA.toGenerateAadhar("Shiva", "10-01-1998", "Male");
		objGA.getAadharNumber();
	}

}
