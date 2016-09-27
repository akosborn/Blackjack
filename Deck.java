package osborn.andrew.blackjack;

import java.util.*;

public class Deck
{
    private List<Card> cards;
    private int numDecks;
    private Card topCard;

    public Deck()
    {
        cards = new ArrayList<>();
    }

    /**
     * createFullDeck(int numDecks) creates a stack of cards with the amount of decks
     * suggested by the user
     *
     * @param numDecks number of decks to use in stack of cards
     */
    public void createFullDeck(int numDecks)
    {
        for (int i = 0; i < numDecks; i++)
        {
            for (Suit suit : Suit.values())
            {
                for (Value value : Value.values())
                {
                    cards.add(new Card(suit.getSuit(), value.getValue(), value.getValueStr()));
                }
            }
        }
    }

    // shuffles List<Card> cards via Collections.shuffle()
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    public String dealCard(int numCardsToDeal)
    {
        String topCardString = "";

        for (int x = 0; x < numCardsToDeal; x++)
        {
            topCard = cards.get(0);
            removeCard();
            topCardString += topCard.toString();
        }
        return topCardString;
    }

    // removes card from deck
    public void removeCard()
    {
            cards.remove(topCard);
    }
}
