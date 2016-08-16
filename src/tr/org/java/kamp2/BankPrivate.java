package tr.org.java.kamp2;
import java.util.Scanner;
public class BankPrivate {
	private double balance;
private int id;
public BankPrivate(int id) {
	this.id=id;
			balance=0;
}
public double getBalance(){
	return balance;
}

	public void withdraw(double amount) {
		if(amount>balance) System.out.println("Insufficient funds");
		else balance =balance-amount;
	}
	public void deposit(double amount) {
		balance +=amount;
	}
}
