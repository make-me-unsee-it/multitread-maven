abstract public class ATM extends Thread{
    protected Card currentCard;

    public ATM(Card currentCard) {
        this.currentCard = currentCard;
    }
}
