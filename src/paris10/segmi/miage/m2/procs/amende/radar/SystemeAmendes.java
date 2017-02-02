package paris10.segmi.miage.m2.procs.amende.radar;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by mohamed on 25/01/2017.
 */

@WebService
@SOAPBinding (style = SOAPBinding.Style.RPC)
public interface SystemeAmendes {

    @WebMethod
    void enregistrer (Voiture car);

    @WebMethod
    int signaler(String immatriculation, String modele, int tarif);

    @WebMethod
    String lister(String immatriculation);

    @WebMethod
    int payer(int numero, String nom, String prenom);


}
