package academy.learnprogramming;

public class SecondsAndMinutes {
	private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
	public static void main(String[] args) {
		getDurationString(61, 0);
		getDurationString(61);
	}
	
	public static String getDurationString(double mins, double sec) {
		if((mins < 0) || (sec < 0 ) || (sec > 59)) {
			return INVALID_VALUE_MESSAGE;
		}
		double hrs = (int) mins / 60;
		double minsLeft = (int) mins % 60;
		System.out.println(mins + " minutes and " + sec + " seconds equals " + hrs + "h " + minsLeft + "m " + sec + "s");
		return hrs + "h " + minsLeft + "m " + sec + "s";
	}
	
	public static String getDurationString(double sec) {
		if(sec <= 0 ) {
			return INVALID_VALUE_MESSAGE;
		}
		
		double mins = (int) sec / 60;
		double secsLeft = (int) sec % 60;
		return getDurationString(mins, secsLeft);
	}
}
