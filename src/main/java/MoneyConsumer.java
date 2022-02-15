import java.math.BigDecimal;

public class MoneyConsumer extends ATM{

    public MoneyConsumer(Card currentCard) {
        super(currentCard);
    }

    @Override
    public void run() {
        while ((currentCard.accountBalance.compareTo(new BigDecimal(1000)) < 0)
                && (currentCard.accountBalance.compareTo(new BigDecimal(0)) > 0)) {
            String randomWithdraw = Double.toString((Math.random() * 25) + 25);
            currentCard.balanceWithdraw(randomWithdraw, getName());
            try {
                sleep((long) ((Math.random() * 1000) + 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        currentCard.ATMStopInfo(getName());
    }
}
