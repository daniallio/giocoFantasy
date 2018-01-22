
package personaggi;


abstract class Umano extends Personaggio{
    
    protected int forzaFisica;
    Arma arma;
    
    //costruttore 
    public Umano(int forzaFisica, Arma arma, String nome_personaggio, double hp) {
        super(nome_personaggio, hp);
        this.forzaFisica = forzaFisica;
        this.arma = arma;
    }

    public Umano() {
    }
    
    //getter setter
    public int getForzaFisica() {
        return forzaFisica;
    }

    public void setForzaFisica(int forzaFisica) {
        this.forzaFisica = forzaFisica;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    
    
   
    
    
}
