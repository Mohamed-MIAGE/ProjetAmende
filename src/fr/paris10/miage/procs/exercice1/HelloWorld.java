package fr.paris10.miage.procs.exercice1;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by mohamed on 25/01/2017.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorld {
    @WebMethod
    String bonjour(String name);
}