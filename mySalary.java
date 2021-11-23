import javax.swing.JOptionPane;
public class mySalary 
{
	public static void main(String[] args)
	{
		double money = 500.00;
		double money2 = 562.50;
		double money3 = 200.21;
		paycheck(money);
		paycheck(money2);
		paycheck(money3);
	}
	
	public static void paycheck(double raise)
	{
		double newSalary;
		final double bonus = 1.1;
		newSalary= raise * bonus;
		JOptionPane.showMessageDialog(null, "This is your new salary " + newSalary);
	}
}
