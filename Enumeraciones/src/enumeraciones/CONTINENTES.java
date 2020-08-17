package enumeraciones;

public enum CONTINENTES {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    private final int paises;
    
    CONTINENTES(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
