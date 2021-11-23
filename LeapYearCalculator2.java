package academy.learnprogramming;

public class LeapYearCalculator2 {
	public static void main(String[] args)
	{
		System.out.println(isLeapYear(2017));
	}
	
	public static boolean isLeapYear(int year)
	{
		boolean leapYear = false;
		if(year >= 1 && year <= 9999){
			if((year % 4) == 0) {
				if((year % 100) == 0){
					if((year % 400) == 0)
						leapYear = true;
					else leapYear = false;}
				else leapYear = true;}
		} return leapYear;
	}
}

