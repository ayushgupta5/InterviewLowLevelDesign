package Service.Card;

import Model.Card.Card;

public class CardService implements ICardService {
    @Override
    public void addCard(Card card) {
        System.out.println("Adding the Card : " + card.toString());
    }

    @Override
    public void removeCard(Card card) {
        System.out.println("Removing the Card : " + card.toString());
    }
}
