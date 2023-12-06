package kolcsonzes;

public class Konyvtar {
    private Konyvtar[] konyv = new Konyvtar[2];

    public Konyvtar(){
        felvesz();
    }
    
    
    public void kolcsonzheto(){
        for (int i = 0; i < konyv.length; i++) {
           if(konyv[i].isAllapot){
               System.out.println(konyv[i].toString());
           }
        }
    }
    public void felvesz(){
       konyv[0] += new ErtekesKonyv("gomboc", 1500);
       konyv[1] += new OlcsoKonyv("korte", 1000, true);

}
}

