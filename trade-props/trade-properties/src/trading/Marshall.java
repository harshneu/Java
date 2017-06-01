package trading;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshall {
	public static void marshal()
	{
		MyList list = new MyList();
		
		list.addElement(new Pair().setName("name").setValue("myName"));
		list.addElement(new Pair().setName("gender").setValue("gender"));
		list.addElement(new Pair().setName("age").setValue("myAge"));
		
		list.printElements();
		System.out.println();
		
		try
		{
			JAXBContext context = JAXBContext.newInstance(MyList.class);
			Marshaller marshaller = context.createMarshaller();
			
			File file = new File("list.xml");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			marshaller.marshal(list, file);
			
		}
		catch (JAXBException e)
		{
			System.out.println(e);
		}
	}

}
