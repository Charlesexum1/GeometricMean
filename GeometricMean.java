// returns Kth root of any product.

import java.text.DecimalFormat;
import java.util.Scanner;
public class GeometricMean {
	
	public void getRootK(){
		Scanner keys = new Scanner(System.in);
		DecimalFormat threeDigits = new DecimalFormat("0.000");
		int input = 0;
		int sentinalValue = -1;
		int k = 0;
		int product = 1;
		double rootK = 0;
		System.out.println("Enter positive integers. -1 breaks the loop.");
		
		input = keys.nextInt();
		
		if (input >= 0) {
		
		while (input != sentinalValue){
			product *= input;
			k++;
			System.out.println("Enter another integer, or -1 to break the loop.");
			input = keys.nextInt();
			}
		rootK = Math.pow(product, 1.0/k); 
		System.out.println(threeDigits.format(rootK));
		}
		else {
			System.out.println("Initial integer was negatie...");
			}
	}

	public static void main (String args[]) {
		GeometricMean demo = new GeometricMean();
		demo.getRootK();
	}

}
