public class Grades
{
	private String name;
	private double score;
	private static double maxPoints;
	Grades(String student, double raw)
	{
		name = student;
		score = raw;
	}
	
	public void setMax(double highScore)
	{
		maxPoints = highScore;
	}
	
	public double calculatePercent()
	{
		return (score / maxPoints) * 100;
	}
	
	public void displayInformation()
	{
		System.out.println("The student's name is " + name + 
				"\nThe student's raw score is " + score + " out of " + maxPoints +
				"\nThe student's perceentage score is " + calculatePercent() + "%");
	}
}
