class BAUM
{
    BAUMELEMENT wurzel;
    
    BAUM()
    {
        wurzel = new ABSCHLUSS();
    }
    
    public DATENELEMENT suchen(DATENELEMENT suchelement){
        return wurzel.Suchen(suchelement);
    }
    
    //public void Einfügen (DATENELEMENT neueDaten)
}
