package academy.learnprogramming;

public class PositiveNegativeZero 
{
	public static void main(String[] args){
		int number = 1;
		checkNumber(number);
	}
	
	public static void checkNumber(int number)
	{
		String value = "";
		if(number > 0){
			value = "positive";
		}else if (number < 0) {
			value = "negative";
		}else if (number == 0) {
			value = "zero";
		}
		System.out.println(value);
	}
}
