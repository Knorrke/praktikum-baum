
/**
 * Beschreiben Sie hier die Klasse WORT.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class WORT implements DATENELEMENT
{
    // Attribute- ersetzen Sie das folgende Beispiel mit Ihren Variable
    String wort;
    /**
     * Konstruktor für Objekte der Klasse WORT
     */
    WORT(String wortNeu)
    {
        // Instanzvariable initialisieren
        wort=wortNeu;
    }

    public boolean IstKleinerAls(DATENELEMENT daten){
        int compare= wort.compareTo(((WORT)daten).WortGeben());
        if(compare<0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean IstGleich(DATENELEMENT daten){
        return wort.equals((WORT)daten);
    }

    public String WortGeben(){
        return wort;
    }
    
    public void Ausgeben() {
        System.out.println(wort);
    }
}
