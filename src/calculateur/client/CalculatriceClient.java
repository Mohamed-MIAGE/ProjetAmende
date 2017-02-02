package calculateur.client;

import calculateur.serveur.CalculateurImp;
import calculateur.serveur.CalculateurInterface;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created by mohamed on 02/02/2017.
 */
public class CalculatriceClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9999/procs/calculatrice?wsdl");
        QName qname = new QName("http://serveur.calculateur/", "CalculateurImpService");
        Service service = Service.create(url, qname);
        CalculateurInterface calc = service.getPort(CalculateurInterface.class);
        System.out.println(calc.addition(3,7));
        System.out.println(calc.soustraction(4,1));
        System.out.println(calc.multiplication(5,4));
    }
}
