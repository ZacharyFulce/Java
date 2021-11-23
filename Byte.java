
public class Byte 
{
	public static void main(String[]args)
	{
		int myValue = 10000;
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Value is " + myValue);
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Integer Maximum Value = " + myMaxIntValue);
		System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Minimum Value " + myMinShortValue);
		System.out.println("Short Maximum Value " + myMaxShortValue);
		
		long myLongValue = 100L;
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Value " + myLongValue);
		System.out.println("Short Minimum Value " + myMinLongValue);
		System.out.println("Long Maximum Value " + myMaxLongValue);
		
		int myTotal = (myMinIntValue / 2);
		short myNewShortValue = (short) (myMinShortValue / 2); 
		System.out.println("My total " + myTotal);
		System.out.println("My new short value " + myNewShortValue);
		
		byte newByte = (byte) 50;
		short newShort = (short) 3352;
		int newInt = 2540051;
		long newLong = (long) (50000 + 10 *(newByte + newShort + newInt));
		System.out.println(newLong);
	}
}
