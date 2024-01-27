import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Trainer> trainers = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("Tournament")) {
            String[] tokens = input.split(" ");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            boolean notContainsTrainer = true;
            for (Trainer trainer : trainers) {
                if (trainer.getName().equals(trainerName)) {
                    trainer.getPokemons().add(pokemon);
                    notContainsTrainer = false;
                    break;
                }
            }
            if (notContainsTrainer) {
                List<Pokemon> pokemons = new ArrayList<>();
                pokemons.add(pokemon);
                Trainer trainer = new Trainer(trainerName, 0, pokemons);
                trainers.add(trainer);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")) {
            for (Trainer trainer : trainers) {
                if (containsPokemon(trainer, input)) {
                    trainer.setNumberOfBadges();
                } else {
                    for (Pokemon pokemon : trainer.pokemons) {
                        pokemon.setPokemonHealth();
                        if (pokemon.getPokemonHealth() == 0) {
                            trainer.pokemons.remove(pokemon);
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (Trainer trainer : trainers) {
            System.out.printf("%s %d %d%n", trainer.toString(), trainer.getNumberOfBadges(), trainer.getPokemons().size());
        }
    }
    private static boolean containsPokemon(Trainer trainer, String input) {
        for (Pokemon pokemon : trainer.getPokemons()) {
            if (pokemon.getPokemonElement().equals(input)) {
                return true;
            }
        }
        for (Pokemon pokemon : trainer.pokemons) {
            pokemon.setPokemonHealth();
        }
        return false;
    }
}
