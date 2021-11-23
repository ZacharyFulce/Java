package academy.learnprogramming;

public class SpeedConverter 
{
	public static void main(String[] args) 
	{
		printConversion(60);
	}
	
	public static long toMilesPerHour(double kilometersPerHour)
	{
		long rounded = 0;
		if(kilometersPerHour >= 0)
		{
			double milesPerHour = kilometersPerHour / 1.609;
			rounded = Math.round(milesPerHour);
		}
		else
		{
			rounded = -1;
		}
		return rounded;
	}
	
	public static void printConversion(double kilometersPerHour) 
	{
		if(kilometersPerHour < 0.0)
		{
			System.out.println("Invalid Value");
		}
		else
		{
			System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
		}
	}
}
