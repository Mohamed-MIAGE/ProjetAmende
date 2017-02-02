package paris10.segmi.miage.m2.procs.amende.radar;

import javax.jws.WebService;

/**
 * Created by mohamed on 25/01/2017.
 */
@WebService(endpointInterface = "paris10.segmi.miage.m2.procs.amende.radar")
public class SystemeAmendesImpl {
    @Override
    public void enregistrer();

    @Override
    public int signaler();

    @Override
    public String lister();

    @Override
    public int payer();
}
