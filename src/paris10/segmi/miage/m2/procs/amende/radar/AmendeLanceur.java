package paris10.segmi.miage.m2.procs.amende.radar;

import javax.xml.ws.Endpoint;

/**
 * Created by mohamed on 02/02/2017.
 */
public class AmendeLanceur {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/procs/amende", new SystemeAmendesImpl());
    }
}
