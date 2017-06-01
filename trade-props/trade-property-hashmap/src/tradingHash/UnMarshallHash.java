package tradingHash;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshallHash {
	static void unmarshal()
	{
		try
		{
			JAXBContext context = JAXBContext.newInstance(MyList.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			File file = new File("list.xml");
			
			MyList list;
			list = (MyList) unmarshaller.unmarshal(file);
			System.out.println("Unmarshalled from 'list.xml'");
			System.out.println("");
			
			list.printElements();
		}
		catch (JAXBException e)
		{
			System.out.println(e);
		}
	}
}
