package tradingHash;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pair
{
	private String name;
	private String value;
	
	Pair() {}
	
	String getName()
	{
		return name;
	}
	
	@XmlElement
	Pair setName(String newName)
	{
		name = newName;
		return this;
	}
	
	
	String getValue()
	{
		return value;
	}
	
	@XmlElement
	Pair setValue(String newValue)
	{
		value = newValue;
		return this;
	}
	
	
	void printPair()
	{
		System.out.println('"' + name + "\" -> \"" + value + '"');
	}
}
