import javax.swing.JOptionPane;
public class Tickets 
{
	public static void main(String[] args)
	{
		int firstFive = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first five digits of the plane ticket."));
		int lastOne = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the last digit of the plane ticket."));
		boolean isTrue = (firstFive % 7 == lastOne);
		JOptionPane.showMessageDialog(null, "The ticket number " + firstFive + lastOne + " is good if true is displayed: " + isTrue);
		isGood();
	}
	public static void isGood()
	{
		boolean isGood = (5 <= 5);
		JOptionPane.showMessageDialog(null, isGood);
	}
}
