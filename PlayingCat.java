package academy.learnprogramming;

public class PlayingCat {
	public static void main(String[] args) {
		System.out.println(isCatPlaying(false, 36));
	}

	public static boolean isCatPlaying(boolean summer, int temperature) {
		boolean playing = false;
		if((summer == false) && (temperature >= 25) && (temperature <=35)) {
			playing = true;
		}
		else if((summer == true) && (temperature >= 25) && (temperature <=45)) {
			playing = true;
		}
		
		return playing;
	}
}
