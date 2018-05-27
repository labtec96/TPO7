package zad1;

public class Bill
{
	int shoopAccountNumber;
	private double price;
	public Bill(int shoopAccountNumber,double price)
	{
		this.shoopAccountNumber = shoopAccountNumber;
		this.price = price;
	}
	public synchronized double getPrice()
	{
		return price;
	}
}
