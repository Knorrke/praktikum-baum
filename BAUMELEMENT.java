
/**
 * Beschreiben Sie hier die Klasse BAUMELEMENT.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public abstract class BAUMELEMENT
{

    // Konstruktor
    public BAUMELEMENT()
    {

    }

    public abstract DATENELEMENT Suchen(DATENELEMENT suchobjekt);

    public abstract BAUMELEMENT Einfügen(DATENELEMENT neueDaten);

    public abstract void AusgebenPreOrder(String prefix);

    public abstract void AusgebenInOrder();

    public abstract void AusgebenPostOrder();

    public abstract BAUMELEMENT Entfernen(DATENELEMENT element);
    
    public abstract BAUMELEMENT Anfügen(BAUMELEMENT teilbaum);
    
    public abstract DATENELEMENT DatenGeben();
}
