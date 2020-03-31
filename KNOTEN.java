
/**
 * Beschreiben Sie hier die Klasse KNOTEN.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KNOTEN extends BAUMELEMENT
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private DATENELEMENT daten;
    private BAUMELEMENT rechterNachfolger;
    private BAUMELEMENT linkerNachfolger;

    /**
     * Konstruktor für Objekte der Klasse KNOTEN
     */
    public KNOTEN(DATENELEMENT neueDaten)
    {

    }

    public KNOTEN(DATENELEMENT neueDaten, KNOTEN neuerLinkerNachfolger,KNOTEN neuerRechterNachfolger){
        daten = neueDaten;
        linkerNachfolger = neuerLinkerNachfolger;
        rechterNachfolger = neuerRechterNachfolger;
    }

    public DATENELEMENT Suchen(DATENELEMENT daten) {
        //TODO
        return null;
    }

    public BAUMELEMENT Einfügen(DATENELEMENT neueDaten) {
        //TODO
        return null;
    }
}
