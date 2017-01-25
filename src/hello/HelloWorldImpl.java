package hello;

import fr.paris10.miage.procs.exercice1.HelloWorld;

import javax.jws.WebService;

/**
 * Created by mohamed on 25/01/2017.
 */
@WebService(endpointInterface = "fr.paris10.miage.procs.exercice1.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String bonjour(String name) {
        return "Bonjour "+name+"\n";
    }
}
