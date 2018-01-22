
package personaggi;


abstract class Mago extends Personaggio{
     int forzaMagica;
    
    
   //costruttore 
    public Mago(int forzaMagica, String nome_personaggio, double hp) {
        super(nome_personaggio, hp);
        this.forzaMagica = forzaMagica;
    }
     
    //getter setter  
    public int getForzaMagica() {
        return forzaMagica;
    }

    public void setForzaMagica(int forzaMagica) {
        this.forzaMagica = forzaMagica;
    }
    
   
   
    
    
    
}
