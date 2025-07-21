package methods;

import java.util.Scanner;

public class Calc2 {

	//without return-type and without parameters
	public static void natSum1() {
		System.out.print("Enter a natural number: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("Sum of "+n+" natural number is "+(n*(n+1)/2));
		
	}
		
	//without return-type and with parameters
	public static void natSum2(int n) {
		System.out.println("Sum of "+n+" natural number is "+(n*(n+1)/2));
		
	}
		
	//with return-type and without parameters
	public static int natSum3() {
		System.out.print("Enter a natural number: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		return (n*(n+1)/2);
			}
				
	//with return-type and with parameters
	public static int natSum4(int n) {
				return (n*(n+1)/2);
				
			}
}
