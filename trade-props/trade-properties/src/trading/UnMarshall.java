package trading;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class UnMarshall
{
	static void unmarshal()
	{
		try
		{
			JAXBContext context = JAXBContext.newInstance(MyList.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			File file = new File("list.xml");
			
			MyList list;
			list = (MyList) unmarshaller.unmarshal(file);
			list.printElements();
		}
		catch (JAXBException e)
		{
			System.out.println(e);
		}
	}
}