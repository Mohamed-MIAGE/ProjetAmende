package calculateur.serveur;


import javax.xml.ws.Endpoint;

/**
 * Created by mohamed on 02/02/2017.
 */
public class CalculateurLanceur {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/procs/calculatrice?", new CalculateurImp());
    }
}
