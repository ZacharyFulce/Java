import javax.swing.*;
public class Textbook 
{
	private String bookName;
	private double price;
	private double tax;
	private static final double rate = .0085;
	private double total;
	private static int count = 0;
	public Textbook()
	{
		this.bookName = "Unknown Text Book";
		this.price = 125.00;
		tax = price * rate;
		total = price + tax;
		count = count + 1;
	}
	
	public Textbook(String name, double cost)
	{
		this.bookName = name;
		this.price = cost;
		tax = price * rate;
		total = price + tax;
		count = count + 1;
	}
	
	public void updateData(String name, double cost)
	{
		total= total - this.price - this.tax;
		this.bookName = name;
		this.price = price;
		this.price = price;
		tax = price * rate;
		total = total + price + tax;
	}
	
	public String getName()
	{
		return bookName;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public double getTax()
	{
		return tax;
	}
	
	public void printInfo()
	{
		JOptionPane.showMessageDialog(null, "Total amount purchased = " + total + "\nNumber of items purchased = " + count);	
	}
}
