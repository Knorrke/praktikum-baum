class BAUM
{
    BAUMELEMENT wurzel;

    BAUM()
    {
        wurzel = new ABSCHLUSS();
    }


    //public DATENELEMENT suchen(DATENELEMENT suchelement)

    
    //public void Einfügen (DATENELEMENT neueDaten)
    
    public void AusgebenPreOrder(){
        wurzel.AusgebenPreOrder();
    }

    public DATENELEMENT suchen(DATENELEMENT suchelement){
        return wurzel.Suchen(suchelement);
    }

    public void Einfügen (DATENELEMENT neueDaten){
        wurzel.Einfügen(neueDaten);
    }
}
