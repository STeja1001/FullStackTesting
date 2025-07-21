package methods;

import java.util.Scanner;

public class Calc1 {

			//without return-type and without parameters
			public void natSum1() {
				System.out.print("Enter a natural number: ");
				Scanner scan=new Scanner(System.in);
				int n=scan.nextInt();
				System.out.println("Sum of "+n+" natural number is "+(n*(n+1)/2));
				
			}
				
			//without return-type and with parameters
			public void natSum2(int n) {
				System.out.println("Sum of "+n+" natural number is "+(n*(n+1)/2));
				
			}
				
			//with return-type and without parameters
			public int natSum3() {
				System.out.print("Enter a natural number: ");
				Scanner scan=new Scanner(System.in);
				int n=scan.nextInt();
				return (n*(n+1)/2);
					}
						
			//with return-type and with parameters
			public int natSum4(int n) {
						return (n*(n+1)/2);
						
					}

	}
