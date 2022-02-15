
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MultiTreadTest {
    private Card card;
    private MoneyConsumer moneyConsumer1;
    private MoneyConsumer moneyConsumer2;
    private MoneyConsumer moneyConsumer3;
    private MoneyConsumer moneyConsumer4;
    private MoneyConsumer moneyConsumer5;
    private MoneyProducer moneyProducer1;
    private MoneyProducer moneyProducer2;
    private MoneyProducer moneyProducer3;
    private MoneyProducer moneyProducer4;
    private MoneyProducer moneyProducer5;

    @Before
    public void setUp() {
        card = new Card("500");
        moneyConsumer1 = new MoneyConsumer(card);
        moneyConsumer2 = new MoneyConsumer(card);
        moneyConsumer3 = new MoneyConsumer(card);
        moneyConsumer4 = new MoneyConsumer(card);
        moneyConsumer5 = new MoneyConsumer(card);
        moneyProducer1 = new MoneyProducer(card);
        moneyProducer2 = new MoneyProducer(card);
        moneyProducer3 = new MoneyProducer(card);
        moneyProducer4 = new MoneyProducer(card);
        moneyProducer5 = new MoneyProducer(card);
    }

    @After
    public void tearDown() {
        moneyProducer1 = null;
        moneyProducer2 = null;
        moneyProducer3 = null;
        moneyProducer4 = null;
        moneyProducer5 = null;
        moneyConsumer1 = null;
        moneyConsumer2 = null;
        moneyConsumer3 = null;
        moneyConsumer4 = null;
        moneyConsumer5 = null;
    }

    @Test
    public void test3Producer4Consumer() {
        moneyProducer1.start();
        moneyProducer2.start();
        moneyProducer3.start();
        moneyConsumer1.start();
        moneyConsumer2.start();
        moneyConsumer3.start();
        moneyConsumer4.start();
    }
}