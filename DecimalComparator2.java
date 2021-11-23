package academy.learnprogramming;

public class DecimalComparator2 {
	public static void main(String[]args) {
		System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.1758));
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
		 boolean decimal = false;
		 double number1 = Math.round(num1 * 1000)/1000.0;
		 double number2 = Math.round(num2 *1000)/1000.0;
		if(number1 == number2) {
			decimal = true;
		}return decimal;
	}
}
