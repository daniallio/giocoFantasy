
package personaggi;


public class Cavaliere extends Umano implements AttaccoFIsico,Move{
    protected int posizione_x;
    protected int posizione_y;
    protected boolean guardia = false;
    //costruttore
    public Cavaliere(int posizione_x, int posizione_y, int forzaFisica, Arma arma, String nome_personaggio, double hp) {
        super(forzaFisica, arma, nome_personaggio, hp);
        this.posizione_x = posizione_x;
        this.posizione_y = posizione_y;
    }

    public Cavaliere() {
        
    }

    

    //getter setter
    public int getPosizione_x() {
        return posizione_x;
    }

    public void setPosizione_x(int posizione_x) {
        this.posizione_x = posizione_x;
    }

    public int getPosizione_y() {
        return posizione_y;
    }

    public void setPosizione_y(int posizione_y) {
        this.posizione_y = posizione_y;
    }

    @Override
    public double attaccoFisico() {
         double valore=0;
        if(guardia == false){       
            valore = (getForzaFisica() * getArma().getPotenza());  
        }
        return valore;         
    }

    @Override
    public int guardiaOn() {
      int x=0;        
        if(guardia == false)
       {    
        x+=20;
        guardia = true;
       }
       return x;
    }

    @Override
    public int guardiaOff() {
      int x=0; 
        if(guardia){             
        x-=200;
        guardia = false;
      }        
        return x;
    }

    
    
    
    
    
}
