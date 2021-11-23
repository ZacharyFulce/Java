package academy.learnprogramming;
import javax.swing.JOptionPane;
public class TeenNumberChecker {
	public static void main(String[] args) {
		int numbers = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a Number"));
		JOptionPane.showMessageDialog(null, isTeen(numbers));
	}
	
	public static boolean hasTeen(int num1, int num2, int num3) {
		boolean teen = false;
		if(num1 >= 13 && num1 <= 19) {
			teen = true;
		}else if(num2 >= 13 && num2 <= 19) {
			teen = true;
		}else if(num3 >= 13 && num3 <= 19) {
			teen = true;
		} return teen;
	}
	
	public static boolean isTeen(int num4) {
		boolean teen2 = false;
		if(num4 >= 13 && num4 <= 19)
			teen2 = true;
		return teen2;
	}
}
