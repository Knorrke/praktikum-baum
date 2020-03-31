
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
        daten = neueDaten;
        rechterNachfolger = new ABSCHLUSS();
        linkerNachfolger = new ABSCHLUSS();
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
        daten.Ausgeben();
        linkerNachfolger.AusgebenPreOrder();
        rechterNachfolger.AusgebenPreOrder();
    }

    public void AusgebenInOrder() {
        linkerNachfolger.AusgebenPreOrder();
        daten.Ausgeben();
        rechterNachfolger.AusgebenPreOrder();
    }

    public void AusgebenPostOrder() {
        linkerNachfolger.AusgebenPreOrder();
        rechterNachfolger.AusgebenPreOrder();
        daten.Ausgeben();
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
