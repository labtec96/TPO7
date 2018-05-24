package zad1;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;

public interface StoreInterface extends Remote
{
	public Bill newOrder(Order order) throws RemoteException;
	public HashMap<Product, Double> askingForProduct() throws RemoteException;
}
