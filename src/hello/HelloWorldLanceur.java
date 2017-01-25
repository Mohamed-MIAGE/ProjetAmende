package hello;

import javax.xml.ws.Endpoint;

/**
 * Created by mohamed on 25/01/2017.
 */
public class HelloWorldLanceur {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/bonjour", new HelloWorldImpl());
    }
}
