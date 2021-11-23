import javax.swing.JOptionPane;
public class Assignment1 
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog(null, "What is your name?");
		System.out.println(name);
		JOptionPane.showMessageDialog(null, name);
	}
}
