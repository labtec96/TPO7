package zad1;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface BankInterface extends Remote
{
	public List<Bill> askForBills(Client client) throws RemoteException;
	public double sumMyOrders(Client client) throws RemoteException;
	public String randomAdvertisement() throws RemoteException;
}
