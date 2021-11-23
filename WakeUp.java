package academy.learnprogramming;

public class WakeUp {
	public static void main(String[] args) {
		System.out.println(shouldWakeUp(true,23));
	}
	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		boolean wakeUp = false;
		if(barking) {
			if(hourOfDay >= 0 && hourOfDay < 8){
				wakeUp = true;
			}else if(hourOfDay > 22 && hourOfDay < 24) {
				wakeUp = true;
			}else {
				wakeUp = false;
			}
		}
		return wakeUp;
	}	
}
