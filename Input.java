import javax.swing.JOptionPane;
public class Input 
{
	public static void main(String[] args)
	{
	String name = JOptionPane.showInputDialog(null, "Enter student name");
	double score = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter raw score"));
	Grades student1 = new Grades(name, score);
	double maxPoints = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter total points possible"));
	student1.setMax(maxPoints);
	student1.displayInformation();
	}
}
