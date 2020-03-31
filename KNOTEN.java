
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
        if(this.daten.IstGleich(daten)){
            return this.daten;
        }
        else if(this.daten.IstKleinerAls(daten)){
            return this.linkerNachfolger.Suchen(daten);
        }
        else {
            return this.rechterNachfolger.Suchen(daten);
        }
    }

    public BAUMELEMENT Einfügen(DATENELEMENT neueDaten) {
        if(neueDaten.IstKleinerAls(daten)){
            linkerNachfolger = linkerNachfolger.Einfügen(neueDaten);
        }
        else{
            rechterNachfolger = rechterNachfolger.Einfügen(neueDaten);
        }
        return this;
    }

    public void AusgebenPreOrder() {

    }

    public void AusgebenInOrder() {

    }

    public void AusgebenPostOrder() {

    }
}
