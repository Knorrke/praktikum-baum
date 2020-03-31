
/**
 * Beschreiben Sie hier die Klasse ZAHL.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ZAHL implements DATENELEMENT
{
    int zahl;
    /**
     * Konstruktor für Objekte der Klasse ZAHL
     */
    ZAHL(int zahlNeu)
    {
        zahl = zahlNeu;
    }
    
    public boolean IstKleinerAls(DATENELEMENT daten){
        ZAHL zahl2 = (ZAHL) daten;
        return zahl < zahl2.ZahlGeben();
    }
    
    public boolean IstGleich(DATENELEMENT daten){
        ZAHL zahl2= (ZAHL) daten;
        return zahl==zahl2.ZahlGeben();
    }
    
    public int ZahlGeben() {
        return zahl;
    }
}
