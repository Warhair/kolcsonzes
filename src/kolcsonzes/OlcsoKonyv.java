package kolcsonzes;

public class OlcsoKonyv extends AbstractTermek implements Kolcsonozheto{
    
    private boolean allapot;

    public OlcsoKonyv(boolean allapot, String nev, int ar) {
        super(nev, ar);
        this.allapot = allapot;
    }

    public boolean isAllapot() {
        return allapot;
    }

}
