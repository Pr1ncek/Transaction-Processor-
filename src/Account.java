
public class Account {
	
	private int id;
	private int balance;
	private int transactions;
	
	public Account(int number){
		id = number;
		balance = 1000;
		//transactions = new Transaction();
		
	}
	
	public int getID(){
		return id;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public int getTransactions(){
		return transactions;
	}
	
	public synchronized void setBalance(int amount){
		balance += amount;
	}
	
	public synchronized void incrementTransactions(){
		transactions++;
	}
	
	
	
	
	@Override
	public String toString(){
		return "acct:" + id + " bal:" + balance + " trans:" + transactions;
	}

}
