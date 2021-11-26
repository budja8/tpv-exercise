package oop.inheritance.ingenico;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class IngenicoChipReader {
    private static volatile IngenicoChipReader chipReader;

    private IngenicoChipReader(){

    }

    public static IngenicoChipReader getChipReader(){
        if(chipReader == null){
            synchronized (IngenicoChipReader.class){
                if(chipReader == null){
                    chipReader = new IngenicoChipReader();
                }
            }
        }
        return chipReader;
    }

    public Card readCard() {
        return Card.builder()
                .account("4558211532252558")
                .entryMode(EntryMode.INSERTED)
                .expirationDate(ExpirationDate.builder()
                        .year(20)
                        .month(8)
                        .build())
                .build();
    }

}
