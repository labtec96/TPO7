package zad1;

public class Order 
{
	String clientId;
	String productName;
	int productId;
	double amount;
	int accountNumber;
	public Order(String clientId, String productName, int productId, double amount,int accountNumber)
	{
		this.clientId = clientId;
		this.productName = productName;
		this.productId = productId;
		this.amount = amount;
		this.accountNumber = accountNumber;
	}
}
