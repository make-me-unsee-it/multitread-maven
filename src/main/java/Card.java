import java.math.BigDecimal;
import org.apache.log4j.Logger;

public class Card {
    public volatile BigDecimal accountBalance;
    private static final Logger log = Logger.getLogger(Card.class);

    public Card(String accountBalance) {
        this.accountBalance = new BigDecimal(accountBalance);
    }

    public void balanceAdd(String add, String processName) {
        accountBalance = accountBalance.add(new BigDecimal(add));
        log.info(processName + " добавил на счет " + add + ". Текущий остаток: " + accountBalance);
    }

    public void balanceWithdraw(String withdraw, String processName) {
        accountBalance = accountBalance.subtract(new BigDecimal(withdraw));
        log.info(processName + " добавил на счет " + withdraw + ". Текущий остаток: " + accountBalance);
    }

    public void ATMStopInfo (String processName) {
        log.info(processName  + " остановлен");
    }
}
