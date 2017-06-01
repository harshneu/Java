package tradingHash;

import java.util.Map;
import java.util.LinkedHashMap;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyList
{
	@XmlElement
	Map<String, Pair> pairs;
	
	MyList()
	{
		pairs = new LinkedHashMap<String, Pair>();
	}
	
	void addElement(Pair p)
	{
		pairs.put(p.getName(), p);
	}
	
	void printElements()
	{
		System.out.println("There are " + pairs.size() + " elements" + (pairs.size() > 0 ? ":\r\n" : "."));
		for (String s : pairs.keySet())
		{
			System.out.print("Key = \"" + s + "\": Value = ");
			pairs.get(s).printPair();
		}
	}
}
