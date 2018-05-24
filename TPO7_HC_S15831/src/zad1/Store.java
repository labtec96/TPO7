package zad1;

import java.rmi.RemoteException;
import java.util.HashMap;

import javax.rmi.PortableRemoteObject;

public class Store  extends PortableRemoteObject implements StoreInterface
{
	HashMap<Product, Double> mapProductQuantity;
	public Store() throws RemoteException
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
	public HashMap<Product, Double> askingForProduct()
	{
		return mapProductQuantity;
	}

}
