
package personaggi;


public class Stregone extends Boss implements AttaccoFIsico,MagiaNera,MagiaBianca{
    
    public Stregone(int forzaMagica, int forzaFisica, String nome_personaggio, double hp) {
        super(forzaMagica, forzaFisica, nome_personaggio, hp);
    }

    @Override
    public double attaccoFisico() {
        double valore=0;
          valore = getForzaFisica();           
        return valore;     
    }

    @Override
    public double fuoco() {
        double valore=0;
          valore = getForzaMagica()*1.20;           
        return valore;     
    }

    @Override
    public double recupera() {
        double valore = 0;
        valore = getForzaMagica();
        return valore;
    }

    @Override
    public String toString() {
        return "Stregone{" + '}';
    }

    
   
}
