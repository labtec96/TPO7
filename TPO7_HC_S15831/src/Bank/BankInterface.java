package Bank;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import Client.Client;
import zad1.Bill;

public interface BankInterface extends Remote
{
	public List<Bill> askForBills(Client client) throws RemoteException;
	public double sumMyOrders(Client client) throws RemoteException;
	public String randomAdvertisement() throws RemoteException;
	public void addMoney(Client client,double amount) throws RemoteException;
	public boolean removeMoney(Client client,double amount) throws RemoteException;
	public String registerClient(Client client) throws RemoteException;
}
