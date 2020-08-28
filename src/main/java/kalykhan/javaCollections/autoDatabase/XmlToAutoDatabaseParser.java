package kalykhan.javaCollections.autoDatabase;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class XmlToAutoDatabaseParser {

    public static AutoDatabase parseXmlToObject(String xmlFileName) {
        try {
            File file = new File(xmlFileName);
            JAXBContext jaxbContext = JAXBContext.newInstance(AutoDatabase.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return (AutoDatabase) jaxbUnmarshaller.unmarshal(file);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void parseObjectToXml(AutoDatabase cars) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(AutoDatabase.class);

            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(cars, new File("vehicle.xml"));

            marshaller.marshal(cars, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
