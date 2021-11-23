package academy.learnprogramming;

public class DecimalComparator{
	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(5.5, 5.5));
	}

	public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
		boolean equalDecimals = false;
		if(num1 == num2) {
			equalDecimals = true;
		}else {
			equalDecimals = false;
		}
			return equalDecimals;
	}
}
