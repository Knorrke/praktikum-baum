
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

    public abstract void AusgebenPreOrder();

    public abstract void AusgebenInOrder();

    public abstract void AusgebenPostOrder();

}
