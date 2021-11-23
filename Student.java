public class Student 
{
	private int ID;
	private int credits;
	private int points;
	private double GPA;
	Student()
	{
		ID = 9999;
		credits = 1;
	}
	public void setID(int idNumber)
	{
		ID = idNumber;
	}
	
	public void setCredits(int creditNumber)
	{
		credits = creditNumber;
	}
	
	public void setPoints(int pointsNumber)
	{
		points = pointsNumber;
	}
	
	public void calculateGPA()
	{
		GPA = (double)(points/credits);
		System.out.println("The GPA for student number " + ID + " is " + GPA);
	}
}	