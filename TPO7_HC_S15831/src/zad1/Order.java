package zad1;

public class Order
{
	String clientId;
	Product product;
	double amount;
	int accountNumber;

	public Order(String clientId, Product product, double amount, int accountNumber)
	{
		this.clientId = clientId;
		this.product = product;
		this.amount = amount;
		this.accountNumber = accountNumber;
	}
}
