package command;

import model.Client;

public class Withdrawal implements IBank {
	private Client client;
	private double amount;
	
	public Withdrawal(double amount, Client client) {
		this.amount = amount;
		this.client = client;
	}
	
	public void execute() {
		if (client.getAccount().getBalance() >= amount) {
			client.getAccount().setBalance(client.getAccount().getBalance() - amount);
			System.out.println("Saldo: " + client.getAccount().getBalance() + "; Retirado: " + amount);
		}
	}
}
