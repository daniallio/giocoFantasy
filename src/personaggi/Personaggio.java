
package personaggi;



public abstract class Personaggio {
    protected String nome_personaggio;
    protected double hp; 
    
    //costruttore 
    public Personaggio(String nome_personaggio, double hp) {
        this.nome_personaggio = nome_personaggio;
        this.hp = hp;
    }

    public Personaggio() {
    }
    
    //getter setter  
    public String getNome_personaggio() {
        return nome_personaggio;
    }

    public void setNome_personaggio(String nome_personaggio) {
        this.nome_personaggio = nome_personaggio;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Personaggio{" + "nome_personaggio=" + nome_personaggio + ", hp=" + hp + '}';
    }
    
    
}
