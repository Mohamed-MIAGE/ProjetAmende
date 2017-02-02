package calculateur.serveur;

import javax.jws.WebService;

/**
 * Created by mohamed on 02/02/2017.
 */

@WebService(endpointInterface = "calculateur.serveur.CalculateurInterface")
public class CalculateurImp implements CalculateurInterface{

    long a;
    long b;

    public CalculateurImp() {
    }

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }

    @Override
    public long addition(long a, long b){
        return (a+b);
    }

    @Override
    public long soustraction(long a, long b){
        return (a-b);
    }

    @Override
    public long multiplication(long a, long b){
        return (a*b);
    }

}
