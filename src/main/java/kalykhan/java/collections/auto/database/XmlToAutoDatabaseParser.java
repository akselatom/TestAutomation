package kalykhan.java.collections.auto.database;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;



public final class XmlToAutoDatabaseParser {

  private XmlToAutoDatabaseParser() { }

  public static AutoDatabase parseXmlToAutoDatabaseObject(
      final String xmlFileName) {
    try {
      File file = new File(xmlFileName);
      JAXBContext jaxbContext = JAXBContext
          .newInstance(AutoDatabase.class);
      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
      return (AutoDatabase) jaxbUnmarshaller.unmarshal(file);

    } catch (JAXBException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void parseAutoDatabaseObjectToXml(
      final AutoDatabase cars, final String xmlFileName) {
    try {
      JAXBContext jaxbContext = JAXBContext
          .newInstance(AutoDatabase.class);
      Marshaller marshaller = jaxbContext.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
      marshaller.marshal(cars, new File(xmlFileName));
      marshaller.marshal(cars, System.out);
    } catch (JAXBException e) {
      e.printStackTrace();
    }
  }
}
