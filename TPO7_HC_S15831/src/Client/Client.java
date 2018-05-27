package Client;

public class Client
{
	String name;
	String lastName;
	double money;
	int accountNumber;
	public Client(String name, String lastName, double money)
	{	
		this.name = name;
		this.lastName = lastName;
		this.money = money;
	}
	public synchronized double getMoney()
	{
		return money;
	}
	public synchronized void setMoney(double money)
	{
		this.money = money;
	}
	public synchronized int getAccountNumber()
	{
		return accountNumber;
	}
	public synchronized void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
}
