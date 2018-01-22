
package personaggi;


public class Arma {
    protected String tipo;
    protected int potenza;
    
    //costruttore 
    public Arma(String tipo, int potenza) {
        this.tipo = tipo;
        this.potenza = potenza;
    }
    
    //getter setter

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotenza() {
        return potenza;
    }

    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }
    
    
}
