package calculateur.serveur;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by mohamed on 02/02/2017.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CalculateurInterface {

    @WebMethod
    long addition(long a, long b);

    @WebMethod
    long soustraction(long a, long b);

    @WebMethod
    long multiplication(long a, long b);

}
