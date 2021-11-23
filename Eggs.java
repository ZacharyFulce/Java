import javax.swing.JOptionPane;
public class Eggs 
{
	public static void main(String[] args)
	{
		int numberOfEggs = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of eggs"));
		dozensOfEggs(numberOfEggs);
	}
	
	public static void dozensOfEggs(int Eggs)
	{
		int dozens = (Eggs / 12);
		int remainder = Eggs % 12;
		JOptionPane.showMessageDialog(null, "The number of dozens is " + dozens + "." + "\nThe remainder is " + remainder);
	}
}
