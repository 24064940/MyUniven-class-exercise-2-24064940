package myfirstprogram;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		
		double amount;
		double principal;
		double rate;
		double time;
		
		System.out.println("Enter principal amount : ");
		principal = scanner.nextDouble();
		
		System.out.println("Enter the rate");
		rate = scanner.nextDouble();
		
		System.out.println("Enter the time");
		time = scanner.nextDouble();
		
		
		amount = principal * Math.pow((1 + rate / 100), time);
		System.out.println("the compound interest is : " + amount);
		
	
			

		
	}

}
