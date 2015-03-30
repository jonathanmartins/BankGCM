package command;

import model.Client;

public class Balance implements IBank {
	private Client client;
	private double balance;
	
	public Balance(Client client) {
		this.client = client;
	}
	
	public void execute() {
		this.balance = (client.getAccount().getBalance());
	}

	public double getBalance() {
		return client.getAccount().getBalance();
	}

	public double getThisBalance() {
		return balance;
	}

}
