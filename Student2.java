public class Student2 
{
	private int ID2;
	private int points2;
	private int credits2;
	private double GPA2;
	public void setID(int idNumber)
	{
		ID2 = idNumber;
	}
	
	public void setPoints(int numberOfPoints)
	{
		points2 = numberOfPoints;
	}
	
	public void setCredits(int numberOfCredits)
	{
		credits2 = numberOfCredits;
	}
	
	public void calculateGPA2()
	{
		GPA2 = (double)(points2/credits2);
		System.out.println("The GPA for Student Number " + ID2 + " is " + GPA2);
	}
}
