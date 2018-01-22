
package personaggi;


abstract class Boss extends Personaggio{
       
    protected int forzaMagica;
    protected int forzaFisica;

    @Override
    public String toString() {
        return "Boss{" + "forzaMagica=" + forzaMagica + ", forzaFisica=" + forzaFisica + '}';
    }
    
    
    //costruttore
     public Boss(int forzaMagica, int forzaFisica, String nome_personaggio, double hp) {
        super(nome_personaggio, hp);        
        this.forzaMagica = forzaMagica;
        this.forzaFisica = forzaFisica;
    }      
    
   //getter setter


    public int getForzaMagica() {
        return forzaMagica;
    }

    public void setForzaMagica(int forzaMagica) {
        this.forzaMagica = forzaMagica;
    }

    public int getForzaFisica() {
        return forzaFisica;
    }

    public void setForzaFisica(int forzaFisica) {
        this.forzaFisica = forzaFisica;
    }
     
   
    
    
}
