package org.entity;

public class Reader extends User {
    private String cardNumber;
    public Reader() {
    }

    public Reader(long userId,String cardNumber,String lastName, String  firstName,String email,String password) {
        super(userId,lastName,firstName,email,password);
        this.cardNumber=cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Reader: {" +
                "cardNumber='" + cardNumber + '\'' +
                ','+ super.toString();
    }
}
