package academy.learnprogramming;

public class FeetAndInchesToCentimeters {
	public static void main(String[] args) {
		double centimeters = calcFeetAndInchesToCentimeters(5, 0);
		if(centimeters <0) {
			System.out.println("Invalid parameters");
		}
		calcFeetAndInchesToCentimeters(100);
	}
	
	/*public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		double cm = -1;
		if(feet>=0 && inches>=0 && inches <= 12) {
			feet = feet * 12;
			cm = (feet + inches) * 2.54;
		} return cm;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		double feet = -1;
		if(inches >= 0) {
			feet = inches / 12;
		} return feet;
		calcFeetAndInchesToCentimeters(feet, inches);
	}*/
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if((feet <0) || ((inches <0)) || (inches >12)) {
			System.out.println("Invalid feet and inches");
			return -1;
		}
		
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
		return centimeters;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches<0) {
			return -1;
		}
		
		double feet = (int) inches / 12;
		double remainingInches = (int) inches % 12;
		System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}
}
