package inner_class;
import inner_class.Person.Currency;
import inner_class.Person.Money;
public class Application {
public static void main(String[] args) {
Person p1 = new Person("John",24);
Money m = p1.new Money(10,Currency.DOLLAR);
p1.addMoney(10,Currency.DOLLAR);
p1.addMoney(30, Currency.DOLLAR);
p1.addMoney(40,Currency.TRY);
System.out.println(p1.toString());
}
}
