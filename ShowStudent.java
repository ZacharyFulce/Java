public class ShowStudent 
{
	public static void main(String[] args)
	{
	Student student1 = new Student();
	student1.setID(1234);
	student1.setCredits(30);
	student1.setPoints(120);
	student1.calculateGPA();
	
	Student student2 = new Student();
	student2.setID(9876);
	student2.setCredits(64);
	student2.setPoints(200);
	student2.calculateGPA();
	
	Student student3 = new Student();
	student3.calculateGPA();
	}
}
