package zad1;

import java.util.HashMap;

public class Store
{
	HashMap<Product, Double> mapProductQuantity;
	public Store()
	{
		mapProductQuantity.put(new Product(1, "kiwi"), 40.0);
		mapProductQuantity.put(new Product(2, "banana"), 40.0);
		mapProductQuantity.put(new Product(3, "apple"), 2.0);
		mapProductQuantity.put(new Product(4, "orange"), 40.0);
	}

	public Bill newOrder(Order order)
	{
		return null;
	}
}
