
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        this.cards.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort(){
        Comparator<Card> comparator = Comparator
				.comparing(Card::getValue)
				.thenComparing(Card::getSuit);

        Collections.sort(cards, comparator);                                      
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
    
    

    @Override
    public int compareTo(Hand hand) {
        int thisHand = this.cards.stream()
                .mapToInt(value -> value.getValue())
                .reduce(0, (c1, c2) -> c1 +c2);
        
        int enemyHand = hand.getCards().stream()
                .mapToInt(value -> value.getValue())
                .reduce(0, (c1, c2) -> c1 +c2);
        
        return thisHand - enemyHand;
        
        
    }
    
    public void sortBySuit(){
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
