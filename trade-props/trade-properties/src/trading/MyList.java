package trading;

import java.util.LinkedList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyList
{
	@XmlElement
	LinkedList<Pair> property;
	
	MyList()
	{
		property = new LinkedList<Pair>();
	}
	
	void addElement(Pair p)
	{
		property.add(p);
	}
	
	void printElements()
	{
		System.out.println("There are " + property.size() + " elements:");
		for (Pair p : property)
		{
			p.printPair();
		}
	}
}
