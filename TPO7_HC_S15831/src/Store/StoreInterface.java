package Store;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;

import zad1.Bill;
import zad1.Order;
import zad1.Product;

public interface StoreInterface extends Remote
{
	public Bill newOrder(Order order) throws RemoteException;
	public HashMap<Product, Double> askingForProduct() throws RemoteException;
}
