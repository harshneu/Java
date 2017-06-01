package tradingHash;

public class Main
{
	public static void main(String[] args)
	{
		if (args.length == 0)
		{
			System.out.println("Run with either -m to marshal or -u to unmarshal");
		}
		else if (args[0].equals("-m"))
		{
			MarshallHash.marshal();
		}
		else if (args[0].equals("-u"))
		{
			UnMarshallHash.unmarshal();
		}
		else
		{
			System.out.println("Run with either -m to marshal or -u to unmarshal");
		}
	}
}
