import java.util.List;

public class Trainer {
    String name;
    int numberOfBadges;
    List<Pokemon> pokemons;
  
    public Trainer (String name, int numberOfBadges, List<Pokemon> pokemons){
        this.name=name;
        this.numberOfBadges=numberOfBadges;
        this.pokemons=pokemons;
    }
  
    public String getName() {
        return name;
    }
  
    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
  
    public List<Pokemon> getPokemons() {
        return pokemons;
    }
  
    public void setNumberOfBadges() {
        this.numberOfBadges+=1;
    }
  
    public int getNumberOfBadges() {
        return numberOfBadges;
    }
  
    public String toString(){
        return getName();
    }
}
