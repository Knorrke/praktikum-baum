
/**
 * Beschreiben Sie hier die Klasse ABSCHLUSS.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ABSCHLUSS extends BAUMELEMENT
{
    // Attribute - ABSCHLUSS hat keine eigenen Attribute

    /**
     * Konstruktor für Objekte der Klasse ABSCHLUSS
     */
    public ABSCHLUSS()
    {
        super();
    }

    public DATENELEMENT Suchen(DATENELEMENT suchobjekt){
        return null;
    }

    public BAUMELEMENT Einfügen(DATENELEMENT neueDaten){

        BAUMELEMENT neuerKnoten = new KNOTEN (neueDaten);

        return neuerKnoten;
    }

    public void AusgebenPreOrder(String prefix) {

    }

    public void AusgebenInOrder() {

    }

    public void AusgebenPostOrder() {

    }

    public BAUMELEMENT Entfernen(DATENELEMENT zuLöschen) {
        return this;
    }
    
    public BAUMELEMENT Anfügen(BAUMELEMENT element) {
        return element;
    }
    
    public DATENELEMENT DatenGeben() {
        return null;
    }
}
