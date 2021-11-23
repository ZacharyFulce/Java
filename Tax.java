import javax.swing.JOptionPane;

public class Tax
{
public static void main(String[]args)	
{
	int salary = Integer.parseInt(JOptionPane.showInputDialog("What is your salary?"));
	double tax = 0;	
	if(salary<9875)
	{
		tax = salary * .1;
	}
	else if(9875 <=salary & salary <40125)
	{
		tax = 987.5 + .12 * (salary - 987.5);
	}
	else if(40125 <= salary & salary < 85525)
	{
		tax = 4617.5 + .22 * (salary- 40125);
	}
	else {
		tax = 0;
	}
	System.out.println("Your tax amount due is " + tax);	
}
}
