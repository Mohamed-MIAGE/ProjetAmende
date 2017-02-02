package calculateur.test;

import calculateur.serveur.CalculateurImp;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by mohamed on 02/02/2017.
 */
public class CalculateurTest {
    private CalculateurImp calculTest = new CalculateurImp();

    @Before
    public void setUp() throws Exception{
        calculTest.setA(5);
        calculTest.setB(3);
    }


    @Test
    public void testAddition() throws Exception{
        assertEquals(calculTest.addition(5,3),8);
    }

    @Test
    public void testSoustraction() throws Exception{
        assertEquals(calculTest.soustraction(5,3),2);
    }

    @Test
    public void testMultiplication() throws Exception{
        assertEquals(calculTest.multiplication(5,3),15);
    }

}
