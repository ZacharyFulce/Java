package academy.learnprogramming;

public class MinsToYearsAndDays {
	public static void main(String[] args) {
		printYearsAndDays(561600);
	}
	
	public static void printYearsAndDays(long mins){
		if(mins < 0) {
			System.out.println("Invalid Value");
		}
		else {
			long days = (long) mins / 1440;
			long years = days / 365;
			long remainingDays = days % 365;
			System.out.println(mins + " min = " + years + " y and " + remainingDays + " d");
		}
	}
}
