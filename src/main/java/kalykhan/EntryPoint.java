package kalykhan;

import kalykhan.javaCollections.autoDatabase.XmlToAutoDatabaseParser;

/**
 * Hello world!
 *
 */
public class EntryPoint
{
    public static void main( String[] args )
    {
        System.out.println( XmlToAutoDatabaseParser.parseXmlToObject("vehicle.xml").getVehicleList());
    }
}
