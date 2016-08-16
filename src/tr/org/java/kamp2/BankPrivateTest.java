package tr.org.java.kamp2;

import java.util.Scanner;

public class BankPrivateTest {
public static void main(String[] args)
{
	double miktar;
	Scanner amoun= new Scanner(System.in);
			miktar=amoun.nextDouble();
BankPrivate acc = new BankPrivate(1);
acc.deposit(2500);
System.out.println(acc.getBalance());
acc.withdraw(5000);
}
}
