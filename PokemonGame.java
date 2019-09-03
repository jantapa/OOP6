import java.util.*;
import java.io.*;


public class PokemonGame {

	public static void main(String args[]){
		
		Pokemon pikachu = new Pokemon("Pikachu");
		Pokemon eevee = new Pokemon("Eevee");
		
		System.out.println("Mini Pokemon");
		System.out.println(pikachu);

		PokemonCenter pc = new PokemonCenter();
		pc.addPokemon(pikachu);
		pc.addPokemon(eevee);
		pc.addPokemon(new Pokemon("Butterfree"));
		
		System.out.println("\nPokemon in PokemonCenter before feed:");
		pc.printPokemons();
		pc.feed();
		System.out.println("\nPokemon in PokemonCenter after feed:");
		pc.printPokemons();
	}
}
