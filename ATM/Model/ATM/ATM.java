package Model.ATM;

public class ATM {
    private String cashDispenser;
    private String cardReader;

    public ATM(String cashDispenser, String cardReader) {
        this.cashDispenser = cashDispenser;
        this.cardReader = cardReader;
    }

    public String getCashDispenser() {
        return cashDispenser;
    }

    public void setCashDispenser(String cashDispenser) {
        this.cashDispenser = cashDispenser;
    }

    public String getCardReader() {
        return cardReader;
    }

    public void setCardReader(String cardReader) {
        this.cardReader = cardReader;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cashDispenser='" + cashDispenser + '\'' +
                ", cardReader='" + cardReader + '\'' +
                '}';
    }
}
