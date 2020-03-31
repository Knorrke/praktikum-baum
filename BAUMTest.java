import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse BAUMTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class BAUMTest
{
    BAUM testBaumZahl= new BAUM();
    int[] testZahlen={18,7, 4, 1, 5, 12, 10,16, 28,23, 21, 24,33,31};
    /**
     * Konstruktor fuer die Test-Klasse BAUMTest
     */
    public BAUMTest()
    {

    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        for(int i=0; i< testZahlen.length; i++){
            testBaumZahl.Einfügen(new ZAHL(testZahlen[i]));
        }
    }
    
    @Test
    public void testEinfügen(){
        ZAHL testZahl=new ZAHL(36);
        testBaumZahl.Einfügen(testZahl);
        System.out.println(testBaumZahl.suchen(testZahl));
    }

    @Test
    public void testSuchen(){
        ZAHL testZahl= new ZAHL(12);
        assertTrue(testBaumZahl.suchen(testZahl).IstGleich(testZahl));
        assertNull(testBaumZahl.suchen(new ZAHL(11)));
    }
    
    @Test
    public void testPreOrder(){
        System.out.println("Pre Order Ausgabe:");
        testBaumZahl.AusgebenPreOrder();
        System.out.println("_____________________");
    }
    
    @Test
    public void testInOrder(){
        System.out.println("In Order Ausgabe:");
        testBaumZahl.AusgebenInOrder();
        System.out.println("_____________________");
    }
    
    @Test
    public void testPostOrder(){
        System.out.println("Post Order Ausgabe:");
        testBaumZahl.AusgebenPostOrder();
        System.out.println("_____________________");
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }
}
