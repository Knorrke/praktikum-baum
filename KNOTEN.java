
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

    public KNOTEN(DATENELEMENT neueDaten, BAUMELEMENT neuerLinkerNachfolger,BAUMELEMENT neuerRechterNachfolger){
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

    public void AusgebenPreOrder() {

    }

    public void AusgebenInOrder() {

    }

    public void AusgebenPostOrder() {

    }
    
    public BAUMELEMENT Entfernen(DATENELEMENT zuLöschen) {
        if (daten.IstGleich(zuLöschen)) {
            linkerNachfolger.Anfügen(rechterNachfolger);
            return linkerNachfolger;
        } else {
            if (daten.IstKleinerAls(zuLöschen)) {
                rechterNachfolger = rechterNachfolger.Entfernen(zuLöschen);
            } else {
                linkerNachfolger = linkerNachfolger.Entfernen(zuLöschen);
            }
            return this;
        }
    }
    
    public BAUMELEMENT Anfügen(BAUMELEMENT element) {
        DATENELEMENT vergleichsDaten = element.DatenGeben();
        if(vergleichsDaten == null) {
            return this;
        }
        
        if(daten.IstKleinerAls(vergleichsDaten)) {
            rechterNachfolger = rechterNachfolger.Anfügen(element);
        } else {
            linkerNachfolger = linkerNachfolger.Anfügen(element);
        }
        return this;
    }
    
    public DATENELEMENT DatenGeben() {
        return daten;
    }
}
