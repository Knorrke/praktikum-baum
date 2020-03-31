
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

    public BAUMELEMENT Einfuegen(DATENELEMENT neueDaten) {
        //TODO
        return null;
    }

    public void AusgebenPreOrder() {

    }

    public void AusgebenInOrder() {

    }

    public void AusgebenPostOrder() {

    }
}
