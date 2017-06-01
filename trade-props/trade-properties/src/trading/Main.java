package trading;


public class Main
{
	public static void main(String[] args)
	{
		if (args.length == 0)
		{
			System.out.println("No changes Made");
		}
		else if (args[0].equals("-m"))
		{
			Marshall.marshal();
			System.out.println("Java Objects converted to XML");
		}
		else if (args[0].equals("-u"))
		{
			UnMarshall.unmarshal();
			System.out.println("Here you see your Java Objects");
		}
		else
		{
			System.out.println("No changes Made");		}
	}
}
