
package personaggi;

public class MagoBianco extends Mago implements MagiaBianca{
     protected int posizione_x;
     protected int posizione_y;
     
    //costruttore 
    public MagoBianco(int posizione_x, int posizione_y, int forzaMagica, String nome_personaggio, double hp) {
        super(forzaMagica, nome_personaggio, hp);
        this.posizione_x = posizione_x;
        this.posizione_y = posizione_y;
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
    public double recupera() {
        double valore = 0;
        valore = getForzaMagica();
        return valore;                 
    }

   
    
    
    
    
}
