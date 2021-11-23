import javax.swing.JOptionPane;
public class HelloName
{
	public static void main(String[] args)
	{
		String name;
		name = JOptionPane.showInputDialog(null, "What is your name?");
		JOptionPane.showMessageDialog(null, "Hello " + name + "!", "Hello", JOptionPane.INFORMATION_MESSAGE);
	}
}