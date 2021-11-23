package academy.learnprogramming;

public class MegaBytesConverter {
	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(5000);
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes >= 0) {
			int megaBytes = (kiloBytes / 1024);
			int remainder = (kiloBytes % 1024);
			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
		}else {
			System.out.println("Invalid Value");
		}
	}
}
