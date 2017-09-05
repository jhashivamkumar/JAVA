package com.codingdojo.pokemon;

public class PokemonTest extends Pokedex {

	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		Pokemon charmander = pokedex.createPokemon("Charmander", "fire", 100);
		Pokemon pikachu = pokedex.createPokemon("Pikachu", "electric", 50);
		
		pokedex.attackPokemon(charmander);
		pokedex.pokemonInfo(charmander);
		pokedex.pokemonInfo(pikachu);
	}

}
