package oop.inheritance.data;

import java.time.LocalDateTime;

public class Transaction {
    private final int amountInCents;
    private final Card card;
    private final LocalDateTime localDateTime;

    private Transaction(int amountInCents, Card card, LocalDateTime localDateTime) {
        this.amountInCents = amountInCents;
        this.card = card;
        this.localDateTime = localDateTime;
    }

    public TransactionBuilder builder(){
        return new TransactionBuilder();
    }

    public int getAmountInCents() {
        return amountInCents;
    }

    public void setAmountInCents(int amountInCents) {
        this.amountInCents = amountInCents;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
