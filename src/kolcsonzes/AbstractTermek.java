package kolcsonzes;

import java.util.UUID;
    
public abstract class AbstractTermek {
   private UUID id;
   private String nev;
   private int ar;

    public AbstractTermek(String nev, int ar) {
        this.nev = nev;
        this.ar = ar;
    }
   
   public void idgenerator(){
       this.id = UUID.randomUUID();
   }

    @Override
    public String toString() {
        return "AbstractTermek{" + "id=" + id + ", nev=" + nev + ", ar=" + ar + '}';
    } 
   
}
