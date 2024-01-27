public class Pokemon {
  
    String pokemonName;
    String pokemonElement;
    int pokemonHealth;
  
    public Pokemon(String pokemonName, String pokemonElement, int pokemonHealth) {
        this.pokemonName = pokemonName;
        this.pokemonElement = pokemonElement;
        this.pokemonHealth = pokemonHealth;
    }
    public String getPokemonElement() {
        return pokemonElement;
    }
    public void setPokemonHealth() {
        this.pokemonHealth = pokemonHealth - 10;
    }
    public int getPokemonHealth() {
        return pokemonHealth;
    }
}
