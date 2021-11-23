import javax.swing.*;
public class Mis3370Quiz1AFall2019
{
	private static String name;
	private static double cost;
	public static void main(String[] args)
	{
		enterInformation();
		Textbook unknownText = new Textbook();
		Textbook java3370 = new Textbook();
		Textbook db3376 = new Textbook(name,cost);
		java3370.updateData("Java Programming", 135.58);
		displayInformation(unknownText);
		displayInformation(java3370);
		displayInformation(db3376);
		java3370.printInfo();
	}
	
	public static void enterInformation()
	{
		name = JOptionPane.showInputDialog(null, " Enter the text book name: ");
		cost = Double.parseDouble(JOptionPane.showInputDialog(null, "What was the price of this text book? "));
	}
	
	public static void displayInformation(Textbook book)
	{
		JOptionPane.showMessageDialog(null, "Book Purchased- " + book.getName() + "\nPurchase Price- " + book.getPrice() + "\nTax Amount- " + book.getTax() + "\nTotal Purchase Including Tax- " + (book.getPrice() + book.getTax()));
	}
}
