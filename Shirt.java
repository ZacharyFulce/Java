public class Shirt
{
	private static final String MATERIAL = "cotton";
	private byte length;
	private float collar;
	Shirt(byte sleeve, float collarSize)
	{
			length = sleeve;
			collar = collarSize;
			System.out.println("Material " + "\tSleeve Length" + "\tCollar Size ");
			System.out.println(MATERIAL+ '\t' + '\t' + length + '\t' + '\t' + collar);
	}
}