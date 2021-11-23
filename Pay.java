public class Pay
{
	public static void main(String[] args)
	{
		computeNetPay(100.5, 6.50, .1);
		computeNetPay(100.5, 6.50);
		computeNetPay(100.5);
	}
	public static void computeNetPay(double hours, double rate, double wRate)
	{
		double grossPay;
		double netPay;
		grossPay = hours * rate;
		netPay = grossPay - (grossPay * wRate);
		System.out.println("When hours, pay rate, and withholding rate are provided, net pay equals " + netPay);
	}
	
	public static void computeNetPay(double hours, double rate)
	{
		double netPay;
		double grossPay;
		double wRate = .15;
		grossPay = hours * rate;
		netPay = grossPay - (grossPay * wRate);
		System.out.println("When hours and pay rate are provided, net pay equals " + netPay);
	}
	
	public static void computeNetPay(double hours)
	{
		double rate = 5.65;
		double wRate = .15;
		double grossPay;
		double netPay;
		grossPay = hours * rate;
		netPay = grossPay - (grossPay * wRate);
		System.out.println("When hours are provided, net pay equals " + netPay);
	}
}
