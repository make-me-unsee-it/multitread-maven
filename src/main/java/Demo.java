public class Demo {
    public static void main(String[] args) {
        Card card = new Card("500");
        MoneyConsumer moneyConsumer1 = new MoneyConsumer(card);
        MoneyConsumer moneyConsumer2 = new MoneyConsumer(card);
        MoneyConsumer moneyConsumer3 = new MoneyConsumer(card);
        MoneyProducer moneyProducer1 = new MoneyProducer(card);
        MoneyProducer moneyProducer2 = new MoneyProducer(card);
        MoneyProducer moneyProducer3 = new MoneyProducer(card);
        MoneyProducer moneyProducer4 = new MoneyProducer(card);
        moneyConsumer1.start();
        moneyConsumer2.start();
        moneyConsumer3.start();
        moneyProducer1.start();
        moneyProducer2.start();
        moneyProducer3.start();
        moneyProducer4.start();
    }
}
