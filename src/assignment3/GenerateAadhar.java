package assignment3;

public class GenerateAadhar {
	
	public void  toGenerateAadhar(String name) {
		System.out.println("Generating Aadhar Number For Name: "+name);
	}
	
	public void toGenerateAadhar(String name, String dob) {
		System.out.println("Generating Aadhar Number For Name: "+name+" and DOB: "+dob);
	}
	
	public void toGenerateAadhar(String name, String dob, String gender) {
		
	System.out.println("Generating Aadhar Number For Name: "+name+" , DOB: "+dob+" and Gender: "+gender);
	}
	
	public void  getAadharNumber() {
		
		System.out.printf("%04d  %04d  %04d\n", (int)(Math.random()*10000),(int)(Math.random()*10000),(int)(Math.random()*10000));
	}
}
