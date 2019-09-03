import java.util.*;
import java.io.*;

public class PokemonCenter{

	private ArrayList<Pokemon> pokemons;


	public PokemonCenter(){

		 this.pokemons = new ArrayList<Pokemon>();

	}

	public void addPokemon(Pokemon thePokemon){
		this.pokemons.add(thePokemon);

	}

	public void feed(){

		for (Pokemon p : pokemons ) {

			p.eat();
			
		}

	}

	public void printPokemons(){
		int i = 1;

		for (Pokemon p : pokemons ) {
						
       System.out.print(""+i);
       System.out.print(".");
       System.out.println(p.toString());
       i++;

		}

   }

}
