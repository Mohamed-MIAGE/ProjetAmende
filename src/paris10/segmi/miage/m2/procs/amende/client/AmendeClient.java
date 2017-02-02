package paris10.segmi.miage.m2.procs.amende.client;

import paris10.segmi.miage.m2.procs.amende.radar.Amende;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created by mohamed on 02/02/2017.
 */
public class AmendeClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9999/procs/amende?wsdl");
        QName qname = new QName("radar.amende.procs.m2.miage.segmi.paris10", "SystemeAmendesImplServices");
        Service service = Service.create(url, qname);
        Amende contravention = service.getPort(Amende.class);
        System.out.println("Amende enregistré");
    }
}
