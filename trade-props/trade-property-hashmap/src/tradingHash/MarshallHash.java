package tradingHash;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshallHash {
	static void marshal()
	{
		MyList list = new MyList();
		
		list.addElement(new Pair().setName("name").setValue("Terry"));
		list.addElement(new Pair().setName("birthday").setValue("08/08/1997"));
		list.addElement(new Pair().setName("favorite color").setValue("red"));
		
		list.printElements();
		System.out.println();
		
		try
		{
			JAXBContext context = JAXBContext.newInstance(MyList.class);
			Marshaller marshaller = context.createMarshaller();
			
			File file = new File("list.xml");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			marshaller.marshal(list, file);
			System.out.println("Marshalled to 'list.xml'");
		}
		catch (JAXBException e)
		{
			System.out.println(e);
		}
	}

}
