package oop.inheritance.data;

public class TransactionBuilder {
    private int amountInCents;
    private Card card;
    private LocalDateTime localDateTime;

    TransactionBuilder() {

    }

    public TransactionBuilder amountInCents(int amountInCents) {
        this.amountInCents = amountInCents;

        return this;
    }

    public TransactionBuilder card(Card card) {
        this.card = card;

        return this;
    }

    public TransactionBuilder localDateTime(int localDateTime) {
        this.localDateTime = localDateTime;

        return this;
    }

    public Transaction build(){
        return new Transaction(amountInCents, card, localDateTime);
    }

}