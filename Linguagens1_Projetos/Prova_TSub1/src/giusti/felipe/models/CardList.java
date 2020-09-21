package giusti.felipe.models;

import java.util.List;

/**
 * Representacao de uma lista de cartas de pokemon
 * @author Felipe Felde Giusti
 * @since 16/09/2020
 */
public class CardList {
    private int currentCardIndex;
    private List<PokemonCard> pokemonCards;

    /**
     * @param pokemonCards Lista de cartas de pokemon do tipo PokemonCard
     */
    public CardList(List<PokemonCard> pokemonCards){
        currentCardIndex = 0;
        this.pokemonCards = pokemonCards;
    }

    /**
     * Metodo que retorna um valor inteiro da posicao carta atual no array
     * @return Int com o index da carta atual
     */
    public int getCurrentCardIndex() {
        return currentCardIndex;
    }

    /**
     * Metodo que retorna uma carta da lista em uma posicao especifica
     * @param index Index da carta desejada na lista
     * @return Carta da lista no index desejado
     */
    public PokemonCard getPokemonCard(int index){
        return pokemonCards.get(index);
    }

    /**
     * Metodo que devolve uma carta no index atual (currentCardIndex)
     * @return carta do tipo PokemonCard armazenada na lista no índice currentCardIndex
     */
    public PokemonCard getPokemonCard(){
        return pokemonCards.get(currentCardIndex);
    }

    /**
     * Aumenta o indice currentCardIndex, voltando a 0 ao atingir a ultima posicao da lista
     */
    public void changeToNextCardIndex(){
        if(currentCardIndex < pokemonCards.size()-1){
            currentCardIndex ++;
        }
        else{
            currentCardIndex = 0;
        }
    }

    /**
     * Reduz o indice atual, currentCardIndex, voltando ao fim da lista ao atingir a posicao 0
     */
    public void changeToLastCardIndex(){
        if(currentCardIndex > 0){
            currentCardIndex --;
        }
        else{
            currentCardIndex = pokemonCards.size()-1;
        }
    }

    /**
     * Adiciona uma carta a lista
     * @param card Carta do tipo PokemonCard a ser adicionada na lista
     */
    public void addCard(PokemonCard card){
        pokemonCards.add(card);
    }

    /**
     * Remove a carta no indice currentCardIndex da lista
     */
    public void removeCard(){
        pokemonCards.remove(currentCardIndex);
    }

    /**
     * Atualiza as informacoes de uma carta da posicao currentCardIndex na lista dada outra carta
     * @param card carta do tipo PokemonCard que sobrescreve a carta atual
     */
    public void updateCard(PokemonCard card){
        pokemonCards.set(currentCardIndex, card);
    }

    /**
     * @return Inteiro com o tamanho da lista
     */
    public int getListSize(){
        return pokemonCards.size();
    }
}
