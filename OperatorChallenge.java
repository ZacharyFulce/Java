package academy.learnprogramming;

public class OperatorChallenge
{
	public static void main(String[] args) 
	{
		double firstValue = 20.00d;
		double secondValue = 80.00d;
		firstValue = (firstValue + secondValue) * 100.00d;
		firstValue = firstValue % 40.00d;
		boolean remainder = (firstValue == 0) ? true : false;
		System.out.println(remainder);
		if(!remainder) {
			System.out.println("Got some remainder");
		}
	}
}
D