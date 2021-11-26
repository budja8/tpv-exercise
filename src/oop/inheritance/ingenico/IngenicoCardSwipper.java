package oop.inheritance.ingenico;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class IngenicoCardSwipper {
    private static volatile IngenicoCardSwipper cardSwipper;

    private IngenicoCardSwipper(){

    }

    public static IngenicoCardSwipper getCardSwipper(){
        if(cardSwipper == null){
            synchronized (IngenicoCardSwipper.class){
                if(cardSwipper == null){
                    cardSwipper = new IngenicoCardSwipper();
                }
            }
        }
        return cardSwipper;
    }

    public Card readCard(){
        return new Card("1246578514563698", new ExpirationDate(23,10), EntryMode.SWIPED);
    }
}
