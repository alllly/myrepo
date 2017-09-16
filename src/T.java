import java.io.StringReader;
import java.io.StringWriter;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

public class T {
	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(EmpList.class);

		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		List<Emp> l = new LinkedList<Emp>();
		for (int i = 0; i < 10; i++) {
			l.add(new Emp("a" + i, new Address("city" + i, "street" + i)));
		}
		EmpList el = new EmpList(l);

		StringWriter sw = new StringWriter();
		m.marshal(el, sw);

		Unmarshaller um = context.createUnmarshaller();
		String s = sw.toString();

		System.out.println(s);

		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");

		EmpList el2 = (EmpList) um.unmarshal(new StreamSource(new StringReader(
				s)));
		System.out.println(el2);

		System.out.println("FINISH ;)");

	}

	

	
	

}
