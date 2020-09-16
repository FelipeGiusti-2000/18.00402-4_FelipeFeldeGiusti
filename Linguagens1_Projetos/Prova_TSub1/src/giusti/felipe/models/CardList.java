package giusti.felipe.models;

import java.util.List;

public class CardList {
    int currentCardIndex;
    List<PokemonCard> pokemonCards;

    public CardList(List<PokemonCard> pokemonCards){
        currentCardIndex = 0;
        this.pokemonCards = pokemonCards;
    }

    public int getCurrentCardIndex() {
        return currentCardIndex;
    }

    public PokemonCard getPokemonCard(int index){
        return pokemonCards.get(index);
    }

    public PokemonCard getPokemonCard(){
        return pokemonCards.get(currentCardIndex);
    }

    public void changeToNextCardIndex(){
        if(currentCardIndex < pokemonCards.size()-1){
            currentCardIndex ++;
        }
        else{
            currentCardIndex = 0;
        }
    }
    public void changeToLastCardIndex(){
        if(currentCardIndex > 0){
            currentCardIndex --;
        }
        else{
            currentCardIndex = pokemonCards.size()-1;
        }
    }
    public void addCard(PokemonCard card){
        pokemonCards.add(card);
    }
    public void removeCard(PokemonCard card){
        pokemonCards.remove(card);
    }
    public void updateCard(PokemonCard card){
        pokemonCards.set(currentCardIndex, card);
    }
}
