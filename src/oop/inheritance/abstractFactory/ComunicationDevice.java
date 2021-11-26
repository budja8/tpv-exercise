package oop.inheritance.abstractFactory;

import oop.inheritance.data.Transaction;
import oop.inheritance.data.TransactionResponse;

public interface CommunicationDevice {
    boolean open();

    boolean send(Transaction transaction);

    TransactionResponse receive();


    void close();
}