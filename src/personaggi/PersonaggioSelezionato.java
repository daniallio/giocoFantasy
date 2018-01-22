
package personaggi;


public class PersonaggioSelezionato {
    Personaggio personaggio;

    public PersonaggioSelezionato(Cavaliere personaggio) {
        personaggio = new Cavaliere();
    }
    
//      public PersonaggioSelezionato(Mago personaggio) {
//        personaggio = new MagoBianco(0, 0, 0, nome_personaggio, 0);
//    }
      
    

    
    
    public Personaggio getPersonaggio() {
        return personaggio;
    }

    public void setPersonaggio(Personaggio personaggio) {
        this.personaggio = personaggio;
    }
    
    
    
}
